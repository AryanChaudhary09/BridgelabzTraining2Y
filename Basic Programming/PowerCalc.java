import java.util.Scanner;
public class PowerCalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b=sc.nextInt();
        System.out.println("Enter the Exponent: ");
        int e=sc.nextInt();
        double Result=Math.pow(b,e);
        System.out.println("The answer is"+Result);
        sc.close();

    }
    
}
