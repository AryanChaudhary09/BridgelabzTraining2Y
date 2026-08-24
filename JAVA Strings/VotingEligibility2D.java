import java.util.Scanner;

public class VotingEligibility2D {
    
    // Method to generate random ages
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 1;
        }
        return ages;
    }
    
    // Method to create 2D array with age and voting status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        System.out.println("-------------------------");
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-10s %-15s%n", array[i][0], array[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        // Generate random ages
        int[] ages = generateAges(n);
        
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);
        
        // Display results
        System.out.println("\n=== Voting Eligibility ===");
        displayTable(eligibility);
        
        scanner.close();
    }
}