import java.util.Scanner;

public class WordsWithLengths {
    
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
    
    // Method to split text into words
    public static String[] splitText(String text) {
        int spaceCount = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0;
        
        for (int i = 0; i < spaceCount; i++) {
            String word = "";
            for (int j = start; j < spaceIndexes[i]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }
        
        String lastWord = "";
        for (int i = start; i < findLength(text); i++) {
            lastWord += text.charAt(i);
        }
        words[wordCount - 1] = lastWord;
        
        return words;
    }
    
    // Method to create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Split into words
        String[] words = splitText(text);
        
        // Create 2D array with word and length
        String[][] wordLengthArray = createWordLengthArray(words);
        
        // Display in tabular format
        System.out.println("\n=== Words and Lengths ===");
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("-----------------------------");
        
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.printf("%-20s %-10s%n", 
                wordLengthArray[i][0], 
                Integer.parseInt(wordLengthArray[i][1]));
        }
        
        scanner.close();
    }
}