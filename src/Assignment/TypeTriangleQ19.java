package Assignment;

import java.util.Scanner;

public class TypeTriangleQ19 {

        static void TriangleShape(double a, double b, double c)
        {
            if (a == b && b == c && a == c)
            {
                System.out.println("The triangle is Equilateral.");
            }
            else if(a == b || b == c || c == a)
            {
                System.out.println("The triangle is Isoceles.");
            }
            else if(a != b || b != c || c != a)
            {
                System.out.println("The triangle is Scalene.");
            }


        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st number to find the triangle type:");
            double a = sc.nextDouble();
            System.out.println("Enter 2nd number to find the triangle type:");
            double b = sc.nextDouble();
            System.out.println("Enter 3rd number to find the triangle type:");
            double c = sc.nextDouble();
            TriangleShape(a, b, c);
        }

}
