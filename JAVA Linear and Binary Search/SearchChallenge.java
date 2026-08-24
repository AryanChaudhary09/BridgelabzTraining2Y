import java.util.Scanner;
import java.util.Arrays;

public class SearchChallenge {
    
    // Linear search for first missing positive
    public static int findMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        
        return n + 1;
    }
    
    // Binary search for target
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find missing positive
        int missing = findMissingPositive(arr);
        System.out.println("First missing positive: " + missing);
        
        // Binary search
        System.out.print("Enter target to search: ");
        int target = scanner.nextInt();
        
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        int index = binarySearch(sortedArr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }
        
        scanner.close();
    }
}