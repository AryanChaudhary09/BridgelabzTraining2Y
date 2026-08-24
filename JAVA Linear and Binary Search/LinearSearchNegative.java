import java.util.Scanner;

public class LinearSearchNegative {
    
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
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
        
        int index = findFirstNegative(arr);
        
        if (index != -1) {
            System.out.println("First negative number at index: " + index + " (value: " + arr[index] + ")");
        } else {
            System.out.println("No negative number found");
        }
        
        scanner.close();
    }
}