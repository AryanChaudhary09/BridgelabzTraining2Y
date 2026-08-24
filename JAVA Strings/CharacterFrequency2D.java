import java.util.Scanner;

public class CharacterFrequency2D {
    
    // Method to find character frequency
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        
        // Create 2D array
        String[][] result = new String[uniqueCount][2];
        int idx = 0;
        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[idx][0] = String.valueOf((char)i);
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