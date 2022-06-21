
//-> Write a program to print the greatest number in three given number.

package JavaBasic1_PractiseProblemSet;

import java.util.Scanner;

public class GreatestNum 
{
    public static void main(String[] args) {
        
        // define data members
        int num1 , num2, num3;

        System.out.println("Please enter the num1 , num2 & num3");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        sc.close();

        
        if(num1 > num2)
            System.out.println(num1 + " " + "is greatest number among the three numbers.");
        else if(num2 > num3)
            System.out.println(num2 + " " + "is greatest number among the three numbers.");
        else if(num3 > num1)
            System.out.println(num3 + " " + "is greatest number among the three numbers.");
        else 
            System.out.println(num1 + " " + "is greatest number among the three numbers.");

    }
}
