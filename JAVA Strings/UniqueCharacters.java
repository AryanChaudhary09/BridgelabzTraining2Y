import java.util.Scanner;

public class UniqueCharacters {
    
    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            
            // Check if character already exists
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
        
        // Create final array with exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Find unique characters
        char[] uniqueChars = findUniqueChars(text);
        
        // Display results
        System.out.println("\nUnique characters:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}