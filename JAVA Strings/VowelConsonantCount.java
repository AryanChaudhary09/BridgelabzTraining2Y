import java.util.Scanner;

public class VowelConsonantCount {
    
    // Method to check if character is vowel or consonant
    public static String checkChar(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    
    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int[] count = new int[2];
        
        for (int i = 0; i < text.length(); i++) {
            String result = checkChar(text.charAt(i));
            if (result.equals("Vowel")) {
                count[0]++;
            } else if (result.equals("Consonant")) {
                count[1]++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Count vowels and consonants
        int[] counts = countVowelsConsonants(text);
        
        // Display results
        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
        scanner.close();
    }
}