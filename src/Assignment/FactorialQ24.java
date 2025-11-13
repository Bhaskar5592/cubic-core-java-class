package Assignment;

import java.util.Scanner;

public class FactorialQ24 {
    public void factorialNum(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of "+ n +" is " + fact);
    }


    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of n: ");
        int n = sc.nextInt();
        FactorialQ24 number = new FactorialQ24();
        number.factorialNum(n);




    }
}

