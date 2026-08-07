import java.util.Scanner;
public class AddtwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1 :"  );
        int num1 =sc.nextInt();
        System.out.println("Enter the num 2 :");
        int num2 = sc.nextInt();
        int Sum = num1+num2;
        System.out.println("The sum of two nos is : " + Sum);
    sc.close();
    }
}