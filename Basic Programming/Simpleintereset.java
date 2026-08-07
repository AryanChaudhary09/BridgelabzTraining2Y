import java.util.Scanner;
public class Simpleintereset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the P: ");
        double P =sc.nextDouble();
        System.out.println("Enter the R :");
        double R = sc.nextDouble();
        System.out.println("Enter the T :");
        double T = sc.nextDouble();
        double SI=(P*R*T)/100;
        System.out.println("The simple interest is : "+ SI);
        sc.close();
    }
    
}
