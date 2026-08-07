import java.util.Scanner;
public class KmtoMiles {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the distance in KM: ");
    double km=sc.nextDouble();
    double Miles=km* 0.621371;
    System.out.println("The distance in Miles is :"+Miles);
    sc.close();
}
    
}
