package Assignment;

import java.util.Scanner;

public class AreaQ10b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a:");
        double a = sc.nextInt();
        System.out.println("Enter the value for b:");
        double b = sc.nextInt();
        System.out.println("Enter the value for c:");
        double c = sc.nextInt();
        double s= (a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is "+area);

    }
}
