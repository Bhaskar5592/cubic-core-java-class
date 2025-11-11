package Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        float principle = sc.nextFloat();
        System.out.print("Enter Time: ");
        float time = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float rate = sc.nextFloat();
        float simpleInterest =principle * time * rate/100;
        System.out.println("The simple interest is " + simpleInterest);



    }
}