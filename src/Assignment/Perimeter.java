package Assignment;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        final double PI = 3.14;
        double perimeter = 2 * PI * radius;
        System.out.println("The perimeter of the circle is " + perimeter);

        System.out.print("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle:");
        double width = sc.nextDouble();
        double perimeter1 = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is " + perimeter1);

        System.out.print("Enter the one side of the triangle:");
        double side = sc.nextDouble();
        System.out.print("Enter the base of the triangle:");
        double base = sc.nextDouble();
        System.out.print("Enter the second side of the triangle:");
        double secondSide = sc.nextDouble();
        double perimeter2 = side + base + secondSide;
        System.out.println("The perimeter of the triangle is " + perimeter2);




    }

    }