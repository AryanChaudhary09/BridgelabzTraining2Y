import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {
    
    public static void writeInputToFile(String filename) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filename)) {
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            
            while (true) {
                line = br.readLine();
                
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                
                fw.write(line + "\n");
            }
            
            System.out.println("Input saved to file!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter filename: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String filename = scanner.nextLine();
        
        writeInputToFile(filename);
        
        scanner.close();
    }
}