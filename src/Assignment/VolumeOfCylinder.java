package Assignment;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        final double PI = 3.14;
        double volume = PI * radius * radius * length;
        System.out.println("The volume of the cylinder is: " + volume);
    }


}
