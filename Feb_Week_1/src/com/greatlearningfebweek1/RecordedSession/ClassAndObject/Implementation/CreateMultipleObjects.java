package com.greatlearningfebweek1.RecordedSession.ClassAndObject.Implementation;

class Studentinfo {
	
	int rollno;
	String name;
	
}

public class CreateMultipleObjects {

	public static void main(String[] args) {
		
		//creating objects
		Studentinfo obj1 = new Studentinfo();
		Studentinfo obj2 = new Studentinfo();
		
		//initialize objects
		obj1.name = "Omkar";
		obj1.rollno = 101;
		
		obj2.rollno = 102;
		obj2.name = "Rajan";
		
		//Display values
		
		System.out.println("1. Name :" + obj1.name + " roll no :" + obj1.rollno );
		System.out.println("2. Name :" + obj2.name + " roll no :" + obj2.rollno );

		
	}
}
