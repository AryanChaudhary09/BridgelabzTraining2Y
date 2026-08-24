import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[count] = i;
                count++;
            }
        }

        System.out.println("Factors of " + n + " are:");

        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}