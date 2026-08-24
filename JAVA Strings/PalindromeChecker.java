import java.util.Scanner;

public class PalindromeChecker {
    
    // Logic 1: Iterative comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    // Logic 2: Recursive comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    
    // Logic 3: Using character arrays
    public static char[] reverseString(String text) {
        char[] result = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(text.length() - 1 - i);
        }
        
        return result;
    }
    
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Check palindrome using 3 methods
        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeArray(text);
        
        // Display results
        System.out.println("\n=== Palindrome Check ===");
        System.out.println("Iterative method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array method: " + (result3 ? "Palindrome" : "Not Palindrome"));
        
        scanner.close();
    }
}