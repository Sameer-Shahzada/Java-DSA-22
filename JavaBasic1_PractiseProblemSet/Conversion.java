
//-> Write a program that reads a number in inches and convet it into meters.

package JavaBasic1_PractiseProblemSet;

public class Conversion 
{
    // create a method 
    static double Conversion_Inches_to_meter(double Inches)
    {
        double meter;
        meter = Inches / 39.37;
        meter = Inches * 0.0254;
        // You have to use one formula for converting the value in Inches to the value in meter

        System.out.printf("Value in meter is - %.3f\n",meter);
        return 0;
    }
    public static void main(String[] args) {
        {
            double Inches = 2.5;

            // invoke method 
            Conversion_Inches_to_meter(Inches);
        }
    }
}
