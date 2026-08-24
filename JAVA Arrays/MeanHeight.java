import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter height of player " + i + " in cm: ");
            double height = sc.nextDouble();
            sum = sum + height;
        }

        double mean = sum / n;

        System.out.println("Mean height of players = " + mean + " cm");
    }
}