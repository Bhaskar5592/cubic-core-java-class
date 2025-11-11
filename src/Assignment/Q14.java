package Assignment;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("The first number is equal to the second number");
        } else if (a > b) {
            System.out.println("The first number is greater than the second number");
        } else {
            System.out.println("The first number is lesser than the second number");
        }


    }
}
