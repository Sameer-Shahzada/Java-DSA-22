

//-> Write a java program to sum values of an array.
import java.util.Scanner;
public class SumofArray {
    
    public static void main(String[] args) {
        // define data fields 
        int element; int sum = 0;

        System.out.println("Please enter the size of the array");

        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        // initialize an array 
        int arr[] = new int[element];

        // to take input from user
        for(int i = 0; i < element; i++)
        {
            arr[i] = sc.nextInt();
        }
        // to calculate the sum of the array elements
        for(int i = 0; i < element; i++)
        {
            sum += arr[i];
        }
        // print the sum of the flaot elements of the array
        System.out.println("Sum of the integer element is - " + sum);
    }
}

