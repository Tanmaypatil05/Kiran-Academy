package Switchcase;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args){

        Scanner t = new Scanner(System.in);
        System.out.print("Enter the name of Employee:-");
        String name = t.next();
        System.out.print("Enter the age of Employee:- ");
        int age = t.nextInt();
        System.out.print("Enter the city of Employee:- ");
        String city = t.next();
        System.out.print("Enter the Job post of Employee:- ");
        String post = t.next();
        System.out.print("Enter the basic Salary per Annum:- ");
        double Salary = t.nextDouble();

        System.out.println("Info of Employee");
        System.out.println("Name of Employee = " + name);
        System.out.println("Age of Employee = " + age);
        System.out.println("City of Employee = " + city);
        System.out.println("Job post of Employee = "+ post);
        System.out.println("Salary of Employee per Annum= "+Salary);

    }
}
