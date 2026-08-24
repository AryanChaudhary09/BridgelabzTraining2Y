import java.util.Scanner;

public class CountingSort {
    
    // Method to perform counting sort
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        
        // Store count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        
        // Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        
        // Place elements in correct positions
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        
        // Copy sorted elements back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
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
        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        int[] ages = new int[n];
        
        System.out.println("Enter ages (10-18):");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal ages:");
        displayArray(ages);
        
        // Sort using counting sort (ages range 10-18)
        countingSort(ages, 10, 18);
        
        System.out.println("\nSorted ages (ascending):");
        displayArray(ages);
        
        scanner.close();
    }
}