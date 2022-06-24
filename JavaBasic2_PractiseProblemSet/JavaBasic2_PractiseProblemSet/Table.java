/*
 
//-> Write a java program that takes a number as input and print its multiplication table upto
10.

 */


package JavaBasic2_PractiseProblemSet;

import java.util.Scanner;

class Table 
{
    public static void main(String[] args) {
        
        int num;

        System.out.println("Please enter any number to print the table");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       
        for(int i = 1; i < 11; i++)
        {
            System.out.println(num * i);
        }

    }
}
