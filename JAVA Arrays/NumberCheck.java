import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking positive, negative, zero, even or odd
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is Positive");

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Even");
                } else {
                    System.out.println(numbers[i] + " is Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}