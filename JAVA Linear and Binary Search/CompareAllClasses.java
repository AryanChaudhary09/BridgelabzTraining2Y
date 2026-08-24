import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareAllClasses {
    
    // Compare StringBuilder and StringBuffer
    public static void compareStringBuilderBuffer() {
        int n = 1000000;
        
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long sbTime = System.nanoTime() - start;
        
        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long sbfTime = System.nanoTime() - start;
        
        System.out.println("StringBuilder time: " + sbTime + " ns");
        System.out.println("StringBuffer time: " + sbfTime + " ns");
    }
    
    // Count words using FileReader
    public static int countWordsFileReader(String filename) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
    
    // Count words using InputStreamReader
    public static int countWordsInputStreamReader(String filename) {
        int count = 0;
        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("=== StringBuilder vs StringBuffer ===");
        compareStringBuilderBuffer();
        
        String filename = "largefile.txt";
        System.out.println("\n=== FileReader vs InputStreamReader ===");
        
        long start = System.nanoTime();
        int count1 = countWordsFileReader(filename);
        long frTime = System.nanoTime() - start;
        
        start = System.nanoTime();
        int count2 = countWordsInputStreamReader(filename);
        long isrTime = System.nanoTime() - start;
        
        System.out.println("FileReader - Words: " + count1 + ", Time: " + frTime + " ns");
        System.out.println("InputStreamReader - Words: " + count2 + ", Time: " + isrTime + " ns");
    }
}