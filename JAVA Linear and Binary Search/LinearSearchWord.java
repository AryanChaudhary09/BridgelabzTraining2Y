import java.util.Scanner;

public class LinearSearchWord {
    
    public static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of sentences: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] sentences = new String[n];
        System.out.println("Enter " + n + " sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }
        
        System.out.print("Enter word to search: ");
        String word = scanner.nextLine();
        
        String result = searchWord(sentences, word);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}