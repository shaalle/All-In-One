import java.util.Scanner;

public class Trapezoid {
    public static void main(String []args){
        // Area of Trapezoid
         Scanner obj = new Scanner(System.in);
         double area;
         System.out.println(" Base of Trapezoid =  ");
         double a = obj.nextDouble();
         System.out.println("Second Base of Trapezoid =  ");
         double b = obj.nextDouble();
         System.out.println("Height of Trapezoid = ");
         double hgt = obj.nextDouble();
         area = 0.5 * (a+b) * hgt;
         System.out.println("Area = "+area);

    }
}
