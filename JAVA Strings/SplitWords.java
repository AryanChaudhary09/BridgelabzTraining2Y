import java.util.Scanner;

public class SplitWords {
    
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
    
    // Method to split text into words without using split()
    public static String[] splitText(String text) {
        // Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        
        // Store space indexes
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        
        // Extract words
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
        
        // Last word
        String lastWord = "";
        for (int i = start; i < findLength(text); i++) {
            lastWord += text.charAt(i);
        }
        words[wordCount - 1] = lastWord;
        
        return words;
    }
    
    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Split using custom method
        String[] customWords = splitText(text);
        
        // Split using built-in method
        String[] builtInWords = text.split(" ");
        
        // Compare arrays
        boolean areEqual = compareArrays(customWords, builtInWords);
        
        // Display results
        System.out.println("\nCustom split result:");
        for (String word : customWords) {
            System.out.println(word);
        }
        
        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        
        System.out.println("\nArrays are equal: " + areEqual);
        
        scanner.close();
    }
}