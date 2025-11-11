package Assignment;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        final double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        System.out.print("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();
        double area1 = length * breadth;
        System.out.println("The area of the rectangle is " + area1);

        System.out.print("Enter the base of the triangle:");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle:");
        double height = sc.nextDouble();
        double area2 = base * height/2;
        System.out.println("The area of the triangle is " + area1);



    }

}
