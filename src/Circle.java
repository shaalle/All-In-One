import java.util.Scanner;

public class Circle {
    public static void main(String []args){
        // Area of Circle
        int radius;
        double pi = 3.14, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        radius = input.nextInt();
        area = pi * radius * radius;
        System.out.println("Area of circle: " +area);
    }
}
