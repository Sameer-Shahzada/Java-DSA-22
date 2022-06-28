
package Java_Basic2_PractiseProblemSet;

public class SumofArray {
    
    public static void main(String[] args) {
        // define data fields 
        int element; float sum = 0;

        System.out.println("Please enter the size of the array");

        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        // initialize an array 
        float arr[] = new float[element];

        // to take input from user
        for(float i = 0; i < element; i++)
        {
            arr[(int)i] = sc.nextFloat();
        }
        // to calculate the sum of the array elements
        for(float i = 0; i < element; i++)
        {
            sum += arr[(int)i];
        }
        // print the sum of the flaot elements of the array
        System.out.println("Sum of the float element is - " + sum);
    }
}

