import java.util.Scanner;

public class CharacterTypes {
    
    // Method to check if character is vowel or consonant
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    
    // Method to create 2D array of character and type
    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkChar(text.charAt(i));
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-10s %-15s%n", array[i][0], array[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Get character types
        String[][] charTypes = getCharacterTypes(text);
        
        // Display in tabular format
        System.out.println("\n=== Character Types ===");
        displayTable(charTypes);
        
        scanner.close();
    }
}