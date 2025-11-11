package Assignment;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        float sum = num1 + num2;
        float avg = sum / 2;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);


    }
}
