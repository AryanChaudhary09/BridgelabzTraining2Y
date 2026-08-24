import java.util.Scanner;

public class TrimSpaces {
    
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
    
    // Method to trim leading and trailing spaces
    public static int[] trimSpaces(String text) {
        int[] result = new int[2];
        int start = 0;
        int end = findLength(text) - 1;
        
        // Find start index (skip leading spaces)
        while (start < findLength(text) && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find end index (skip trailing spaces)
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        
        result[0] = start;
        result[1] = end;
        
        return result;
    }
    
    // Method to create substring using charAt()
    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (findLength(str1) != findLength(str2)) {
            return false;
        }
        
        for (int i = 0; i < findLength(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text with spaces: ");
        String text = scanner.nextLine();
        
        // Trim using custom method
        int[] indexes = trimSpaces(text);
        String customTrimmed = getSubstring(text, indexes[0], indexes[1]);
        
        // Trim using built-in method
        String builtInTrimmed = text.trim();
        
        // Compare
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
        // Display results
        System.out.println("\nCustom trim: '" + customTrimmed + "'");
        System.out.println("Built-in trim(): '" + builtInTrimmed + "'");
        System.out.println("Results match: " + areEqual);
        
        scanner.close();
    }
}