import java.util.Scanner;

public class CharacterFrequencyUnique {
    
    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
    
    // Method to find character frequency
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueChars(text);
        
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
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