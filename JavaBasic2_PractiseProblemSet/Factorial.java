
//-> Write a program to find the factorial value of any number & take input from user 

import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) {
        // define data fields
        int num , i , fact = 1;

        // to take input from user
        System.out.println("Please enter any number to find the factorial");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(i = 1; i <= num; i++)
        {
            fact = fact * i;
            
        }
        System.out.print("Factorial of " + num + " is " + fact);
    }    
}
