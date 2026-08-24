import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] odd = new int[n];
        int[] even = new int[n];

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenCount] = i;
                evenCount++;
            } else {
                odd[oddCount] = i;
                oddCount++;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
    }
}