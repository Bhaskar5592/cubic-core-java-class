package Assignment;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double fToc= (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is " + fToc);
        System.out.println("Enter the temperature in Celsius:");
        double celsius = sc.nextDouble();
        double cTof= (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is " +cTof);

    }

}
