import java.util.Scanner;

public class BMICalculator10 {
    
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;
            
            double bmi = weight / (heightM * heightM);
            String status;
            
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", 
                data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] personData = new double[10][2];
        
        // Take input for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        // Calculate BMI
        String[][] bmiData = calculateBMI(personData);
        
        // Display results
        System.out.println("\n=== BMI Report ===");
        displayTable(bmiData);
        
        scanner.close();
    }
}