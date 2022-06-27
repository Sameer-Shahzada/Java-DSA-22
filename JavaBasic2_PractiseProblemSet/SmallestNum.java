
//-> Write a java method to find the smallest number among three numbers

package JavaBasic2_PractiseProblemSet;
import java.util.Scanner;
public class SmallestNum 
{
    // define data fields 
    int num1 , num2 , num3;

    // create a method to take input from user
    void numsInputs()
    {
    System.out.println("Please enter three number to find the smallest number");

    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    }

    // create a method to find the smallest number 
    void smallestNum()
    {
        if(num1 < num2 && num1 < num3) 
            System.out.println(num1 + " is the smallest number among three numbers");
        else if(num2 < num3)
            System.out.println(num2 + " is the smallest number among three numbers");
        else 
            System.out.println(num3 + " is the smallest number among three numbers");
    }
}
class TestSmallestNumber 
{
    public static void main(String[] args) {
        // create an instance of the class 
        SmallestNum obj = new SmallestNum();

        // method invokation 
        obj.numsInputs();
        obj.smallestNum();
    }
}
