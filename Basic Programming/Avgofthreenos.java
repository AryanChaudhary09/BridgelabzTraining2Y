import java.util.Scanner;
public class Avgofthreenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a=sc.nextInt();
        System.out.println("Enter the b: ");
        int b=sc.nextInt();
        System.out.println("Enter the c: ");
        int c=sc.nextInt();
        int avg= (a+b+c)/3;
        System.out.println("The average is : "+avg);
        sc.close();
}
}
