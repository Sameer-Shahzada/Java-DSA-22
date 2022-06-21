
//-> Write a program to print the area and perimeter of a circle

package JavaBasic1_PractiseProblemSet;

public class Area_PerimeterCircle 
{
    // method to find the area of circle 
    void areaCircle(int r)
    {
        double areaOfCircle;
        areaOfCircle = 3.14 * r * r;

        System.out.println("Area of circle is - " + areaOfCircle);
    }

    // method to find the perimeter of circle
    void perimeterCircle(int r)
    {
        double perimeterOfCirlce;
        perimeterOfCirlce = 2 * 3.14 * r; 
        System.out.println("Permiter of circle is - " + perimeterOfCirlce);
    }

}
class Test 
{
    public static void main(String[] args) {
        // create an instance of the class 
        Area_PerimeterCircle ar_pr = new Area_PerimeterCircle();
        
        // invoke method
        ar_pr.areaCircle(5);
        ar_pr.perimeterCircle(4);
    }
}
