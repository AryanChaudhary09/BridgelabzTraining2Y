import java.util.Scanner;

public class SelectionSort {
    
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        
        int[] scores = new int[n];
        
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal scores:");
        displayArray(scores);
        
        // Sort using selection sort
        selectionSort(scores);
        
        System.out.println("\nSorted scores (ascending):");
        displayArray(scores);
        
        scanner.close();
    }
}