
//-> Write a java program to swap two numbers.

package JavaBasic1_PractiseProblemSet;

import java.util.Scanner;

public class Swapping 
{
    public static void main(String[] args) {
        // define data fields 
        int num1 , num2 , temp;

        System.out.println("Please enter the num1 & num2");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    
        sc.close();
       
        System.out.println("Before Swapping  \n" + "num1 - " + num1 + "\n" + "num2 - " + num2);

        // Swapping logic by using three variables
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping  \n" + "num1 - " + num1 + "\n" + "num2 - " + num2);


    }    
}
