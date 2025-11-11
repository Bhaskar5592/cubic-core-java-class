package Assignment;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an ASCII Code from 0 to 128:");
        int a=sc.nextInt();
        if(a>=0 && a<=128) {
            char character1=(char)a;
            System.out.print("The ASCII charcter of " +a+" is:" +character1);
        }
     else{System.out.println("Invalid ASCII Code");}
    }
}
