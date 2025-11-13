package Assignment;
import java.util.Scanner;

public class OddEvenQ16 {

    static void EvenOdd(int num){

        if (num%2==0){
            System.out.println("It is an Even number");
        }else{
            System.out.println("It is an Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find out odd or even:");
        int num = sc.nextInt();
        EvenOdd(num);


    }
}
