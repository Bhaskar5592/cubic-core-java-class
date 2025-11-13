package Assignment;

import java.util.Scanner;

public class LargestNoQ18 {
     static void Largest(int a, int b, int c)
    {
        if ((a>b) && (a>c))
            {
            System.out.println("The largest number is " + a);
            }
        else if((b>a) && (b>c))
            {
            System.out.println("The largest number is " + b);
            }
        else if((c>a) && (c>b))
            {
            System.out.println("The largest number is " + c);
            }


    }
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number to find the largest number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number to find the largest number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number to find the largest number:");
        int c = sc.nextInt();
        Largest(a, b, c);
    }
}
