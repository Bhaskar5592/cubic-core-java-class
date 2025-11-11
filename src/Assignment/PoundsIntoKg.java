package Assignment;
import java.util.Scanner;
public class PoundsIntoKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of pounds:");
        double pounds = sc.nextDouble();
        double kgToPounds = pounds * 0.45359237;
        System.out.print(pounds + " pound is "+ kgToPounds +"kg");

    }
}
