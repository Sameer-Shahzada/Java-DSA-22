
//-> Write a program to print the leap year 

package JavaBasic1_PractiseProblemSet;

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) {
        // define data fields
        int year;

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        sc.close();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " " + "is a Leap year.");
        else 
            System.out.println(year + " " + "is not a Leap year");

    }    
}
