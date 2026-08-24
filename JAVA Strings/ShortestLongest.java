import java.util.Scanner;

public class ShortestLongest {
    
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
    
    // Method to find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] wordLengthArray) {
        int[] result = new int[2];
        int shortestIdx = 0;
        int longestIdx = 0;
        int shortestLen = Integer.parseInt(wordLengthArray[0][1]);
        int longestLen = Integer.parseInt(wordLengthArray[0][1]);
        
        for (int i = 1; i < wordLengthArray.length; i++) {
            int len = Integer.parseInt(wordLengthArray[i][1]);
            if (len < shortestLen) {
                shortestLen = len;
                shortestIdx = i;
            }
            if (len > longestLen) {
                longestLen = len;
                longestIdx = i;
            }
        }
        
        result[0] = shortestIdx;
        result[1] = longestIdx;
        
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
        
        // Find shortest and longest
        int[] indexes = findShortestLongest(wordLengthArray);
        
        // Display results
        System.out.println("\nShortest word: " + wordLengthArray[indexes[0]][0] + 
                          " (Length: " + wordLengthArray[indexes[0]][1] + ")");
        System.out.println("Longest word: " + wordLengthArray[indexes[1]][0] + 
                          " (Length: " + wordLengthArray[indexes[1]][1] + ")");
        
        scanner.close();
    }
}