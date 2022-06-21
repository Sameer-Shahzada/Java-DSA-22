
//-> Write a program for grading system based on student marks.

package JavaBasic1_PractiseProblemSet;

import java.util.Scanner;

public class GradingSystem 
{
    public static void main(String[] args) {
        // define data fields
        int marks;

        System.out.println("Please enter student marks");

        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        sc.close();

        if(marks < 33)
            System.out.println("Grade - F");
        else if(marks > 33 && marks <= 50)
            System.out.println("Grade - E");
        else if(marks > 50 && marks <= 60)
            System.out.println("Grade - D {2nd Devision}");
        else if(marks > 60 && marks <= 70)
            System.out.println("Grade - C {1st Devision}");
        else if(marks > 70 && marks <= 80)
            System.out.println("Grade - B {1st Devision Hons}");
        else if(marks > 80 && marks <= 90)
            System.out.println("Grade - A");
        else if(marks > 90 && marks <= 100)
            System.out.println("Grade - A+");
        else 
            System.out.println("Invalid marks");


    }    
}
