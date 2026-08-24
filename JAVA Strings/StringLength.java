import java.util.Scanner;

public class StringLength {
    
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Get length using custom method
        int customLength = findLength(text);
        
        // Get length using built-in method
        int builtInLength = text.length();
        
        // Display results
        System.out.println("\nCustom method length: " + customLength);
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Results match: " + (customLength == builtInLength));
        
        scanner.close();
    }
}