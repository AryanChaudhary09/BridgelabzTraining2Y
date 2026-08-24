import java.util.Scanner;

public class AnagramChecker {
    
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Convert to lowercase
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();
        
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Count frequency of characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];
        
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }
        
        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine();
        
        // Check if anagrams
        boolean result = areAnagrams(text1, text2);
        
        // Display result
        System.out.println("\nResult: " + (result ? "Anagrams" : "Not Anagrams"));
        
        scanner.close();
    }
}