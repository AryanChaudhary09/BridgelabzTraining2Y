import java.util.Scanner;

public class InsertionSort {
    
    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Insert key at correct position
            arr[j + 1] = key;
        }
    }
    
    // Method to display array
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        
        int[] employeeIDs = new int[n];
        
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal employee IDs:");
        displayArray(employeeIDs);
        
        // Sort using insertion sort
        insertionSort(employeeIDs);
        
        System.out.println("\nSorted employee IDs (ascending):");
        displayArray(employeeIDs);
        
        scanner.close();
    }
}