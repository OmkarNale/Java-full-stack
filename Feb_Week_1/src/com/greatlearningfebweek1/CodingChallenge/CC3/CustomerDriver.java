package com.greatlearningfebweek1.CodingChallenge.CC3;

/*
 * a.Start
 * b.Create a classCustomer
 * c.Create different variables such as (firstName, lastName,....)of different accessmodifiers
 * d.Create a classCustomerDriver
 * e.Create the main method in theCustomerDriver
 * f.Create an objectcustomer of class Customerinsidethe main method
 * g.Print variablesusing objectcustomer.
 * h.Stop
 * 
 * */
class Customer {
	
	private int id = 101;
	public int rollNo = 102;
	protected String name = "Omkar";
	
}
public class CustomerDriver {

	public static void main(String[] args) {
		
		Customer object = new Customer();
		
//		System.out.println("id :" + object.id);       //Error :The field Customer.id is not visible
		System.out.println("rollNo : "+ object.rollNo);
		System.out.println("name :" + object.name );
	}
}
