package com.greatlearningfebweek1.CodingChallenge.CC1;
/**
 * Algorithm:
 * 
 * a.Start
 * b.Create a classCustomer
 * c.Create string and integer variablefullNameandagerespectively.
 * d.Create  main method in the same class
 * e.Create an objectcustomer of class Customerinsidethe main method
 * f.Assign your name infullNamevariable and your ageinagevariable from mainmethod using the objectcustomer
 * g.PrintfullNameandageusing theobjectcustomer.
 * h.Stop
 * 
 * */
public class Customer {
	
	String fullName;
	int age;

	public static void main(String[] args) {
		
		Customer obj1 = new Customer();
		
		obj1.fullName = "Omkar Nale";
		obj1.age = 23;
		
		System.out.println("Name :"+obj1.fullName);
		System.out.println("RollNo :"+obj1.age);
	}
}
