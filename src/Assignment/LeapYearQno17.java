package Assignment;

import java.util.Scanner;

public class LeapYearQno17 {
    public static void LeapCheck(int year){
        if((year%4==0) && (year%100!=0))
        {
            System.out.println("It is a Leap Year.");
        }
        else if((year%4==0) &&  (year%100==0)){
            System.out.println("It is a Leap Year.");
        }
        else{
            System.out.println("It is not a Leap Year.");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not:");
        int year=sc.nextInt();
        LeapCheck(year);
    }
}
