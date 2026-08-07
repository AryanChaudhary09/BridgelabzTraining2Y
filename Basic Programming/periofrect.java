import java.util.Scanner;
public class periofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double L=sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double B=sc.nextDouble();
        double peri=2*(L+B);
        System.out.println("The peri of rect is : "+ peri);
        sc.close();
    }
    
}
