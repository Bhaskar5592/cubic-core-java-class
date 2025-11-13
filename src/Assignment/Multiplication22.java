package Assignment;
import java.util.Scanner;

public class Multiplication22{
    public void printTables(int n){
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }

    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print multiplication tables of: ");
        int n = sc.nextInt();
        Multiplication22 table = new Multiplication22();
        table.printTables(n);


    }
}