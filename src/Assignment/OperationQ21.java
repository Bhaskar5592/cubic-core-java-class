package Assignment;

import java.util.Scanner;

public class OperationQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the choices: ");
        char choice = sc.next().charAt(0);
        if(choice == '+' || choice == '-' || choice == '*' || choice == '/') {

        }
        switch (choice) {
            case '+':
                int sum = number1 + number2;
                System.out.println("Addition is: " + sum);
                break;
            case '-':
                int difference = number1 - number2;
                System.out.println("Subtraction is: " + difference);
                break;
            case '*':
                int multiplication = number1 * number2;
                System.out.println("Multiplication is: " + multiplication);
                break;
            case '/':
                int division = number1 / number2;
                System.out.println("Division is: " + division);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("end");
    }
}