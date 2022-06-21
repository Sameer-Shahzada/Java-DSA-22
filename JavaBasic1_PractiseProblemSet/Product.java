
//-> Write a program that takes two numbers as input and display the product of two numbers.

package JavaBasic1_PractiseProblemSet;
import java.util.Scanner;

class Product
{
    public static void main(String[] args) {
        // define data fields 
        int num1 , num2;

        System.out.println("Please enter num1 & num2");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        sc.close();
        
        int product = num1 * num2;

        System.out.println("Product of two digit is - " + num1 + "*" + num2 + " = " + product);
    }
}