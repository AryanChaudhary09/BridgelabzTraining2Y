import java.util.Scanner;
public class VolumeOfCylinder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius=sc.nextDouble();
        System.out.println("Enter heigth:");
        double height=sc.nextDouble();
        double volume=3.14*radius*radius*height;
        System.out.println("Volume of cylinder is:"+volume);
        sc.close();
    }
}