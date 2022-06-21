
//-> Write a program to swap two numbers without using third variable

package JavaBasic1_PractiseProblemSet;

import java.util.Scanner;

public class Swapping2 
{
    public static void main(String[] args) {
        // define data fields 
        int x , y;

        System.out.println("Please enter the value of x & y");

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        System.out.println("Before Swapping  \n" + "X - " + x + "\n" + "Y - " + y);

        // Swapping logic without using third variable
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping  \n" + "X - " + x + "\n" + "Y - " + y);

    }    
}
