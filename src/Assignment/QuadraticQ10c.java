package Assignment;
import java.util.Scanner;

public class QuadraticQ10c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value for b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value for c:");
        double c = sc.nextDouble();
        double x= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The quadratic is: "+x);

    }
}
