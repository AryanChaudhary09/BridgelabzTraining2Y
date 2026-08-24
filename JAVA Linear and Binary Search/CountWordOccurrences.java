import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrences {
    
    public static int countWord(String filename, String targetWord) {
        int count = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();
        
        System.out.print("Enter word to search: ");
        String word = scanner.nextLine();
        
        int count = countWord(filename, word);
        
        System.out.println("Word '" + word + "' appears " + count + " times");
        
        scanner.close();
    }
}