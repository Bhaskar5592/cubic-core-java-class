package Assignment;
import java.util.Scanner;

public class PrintNoQ13 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        if (number<0)
        {
            System.out.println("Your number is: "+number);
        }
        else

        {System.out.println("Invalid number");}

    }
}
