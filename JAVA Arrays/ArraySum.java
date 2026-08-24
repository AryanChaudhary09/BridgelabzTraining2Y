import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Enter numbers:");

        while (count < 10) {
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            numbers[count] = num;
            sum = sum + num;
            count++;
        }

        System.out.println("Numbers entered:");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }
}