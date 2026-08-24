import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicates(input);
        
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
        
        scanner.close();
    }
}