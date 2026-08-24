import java.util.Scanner;

public class CharacterFrequencyNested {
    
    // Method to find character frequency using nested loops
    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        
        // Initialize frequency array
        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
        }
        
        // Count frequency using nested loops
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '\0'; // Mark as counted
                }
            }
        }
        
        // Count valid characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\0') {
                count++;
            }
        }
        
        // Create result array
        String[][] result = new String[count][2];
        int idx = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\0') {
                result[idx][0] = String.valueOf(chars[i]);
                result[idx][1] = String.valueOf(frequency[i]);
                idx++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Find character frequency
        String[][] frequency = findFrequency(text);
        
        // Display results
        System.out.println("\n=== Character Frequency ===");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");
        
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%-10s %-10s%n", frequency[i][0], frequency[i][1]);
        }
        
        scanner.close();
    }
}