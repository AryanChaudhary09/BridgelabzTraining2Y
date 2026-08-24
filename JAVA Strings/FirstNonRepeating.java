import java.util.Scanner;

public class FirstNonRepeating {
    
    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];
        
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0'; // No non-repeating character
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Find first non-repeating character
        char result = findFirstNonRepeating(text);
        
        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}