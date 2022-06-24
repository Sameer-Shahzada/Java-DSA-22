package JavaBasic2_PractiseProblemSet;

import java.util.Scanner;
class Employee 
{
    // define data fields 
    String emp_Name;
    int emp_No;
    
    // create a method to take input from user 
    void employeeInputs()
    { 
    System.out.println("Please enter the Employee name & Employee number");
    
    Scanner sc = new Scanner(System.in);
    
    emp_Name = sc.nextLine();
    emp_No = sc.nextInt();
    }
}
class Salary extends Employee 
{
    float salary,hra,da,it,gp;
    
    // create a method to take input from user 
    void salaryInputs()
    {
    System.out.println("Please enter the Employee salary");
    
    Scanner scr = new Scanner(System.in);
    salary = scr.nextFloat();
    }
    // create a method to calculate the salary
    void calculate()
    {
        hra = salary*0.1f;
		da = salary*0.5f;
		it = salary*0.06f;
		gp = salary+hra+da-it;
    }
    // create a method to display Salary Slip
    void displaySalarySlip()
    {
        System.out.println(" **** Salary Slip **** ");
        System.out.println("Employee Name - " + emp_Name);
        System.out.println("Employee Number - " + emp_No);
        System.out.println("Employee basic pay salary - " + salary);
        System.out.println("Housing Rent Allowance - " + hra);
		System.out.println("Dearness Allowance - " + da);
		System.out.println("Income Tax - " + it);
		System.out.println("Gross Pay - " +gp);
    }
}
    class TestEmployee
    {
        public static void main(String s[])
        {
            // create an instance of the class 
            Salary salObj = new Salary();
            salObj.employeeInputs();
            salObj.salaryInputs();
            salObj.calculate();
            salObj.displaySalarySlip();
        }
    }
