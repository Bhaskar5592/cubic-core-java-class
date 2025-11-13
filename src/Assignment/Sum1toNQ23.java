package Assignment;

import java.util.Scanner;

public class Sum1toNQ23 {

    public void calculateSum(int n){
        int sum;
        sum = n*(n+1)/2;
            System.out.println("The sum of n is " +sum);

        }



    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of n: ");
        int n = sc.nextInt();
        Sum1toNQ23 number = new Sum1toNQ23();
        number.calculateSum(n);



    }
}