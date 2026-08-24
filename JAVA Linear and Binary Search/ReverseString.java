import java.util.Scanner;

public class ReverseString {
    
    public static String reverseUsingStringBuilder(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseUsingStringBuilder(input);
        
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        
        scanner.close();
    }
}