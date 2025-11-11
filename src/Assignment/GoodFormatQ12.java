package Assignment;
import java.util.Scanner;

public class GoodFormatQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        String age = sc.nextLine();
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your Nationality:");
        String nationality = sc.nextLine();
        System.out.println("Your name is "+name+".");
        System.out.println("Your Nationality is "+nationality+".");
        System.out.println("Your age is "+age+".");

    }
}
