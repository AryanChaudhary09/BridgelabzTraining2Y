import java.util.Scanner;

public class BubbleSort {
    
    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swaps, array is sorted
            if (!swapped) {
                break;
            }
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
        
        int[] marks = new int[n];
        
        System.out.println("Enter marks for " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal marks:");
        displayArray(marks);
        
        // Sort using bubble sort
        bubbleSort(marks);
        
        System.out.println("\nSorted marks (ascending):");
        displayArray(marks);
        
        scanner.close();
    }
}