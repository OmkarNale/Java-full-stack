package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Final;

public class FinalDemo {

	// final variable 
	final float pi = 3.14f;
	double radius = 5;
	double area;
	
	// final method 
	 final void calculateAreaOfCircle(int radius) {
	 
//		pi = 22/7;                           // ERROR:	The final field FinalDemo.pi cannot be assigned
		area = (2 * pi * (radius * radius));
		System.out.println("Area of Circle is :"+area);
	}
	
	public static void main(String[] args) {
		
		FinalDemo object = new FinalDemo();
		
		object.calculateAreaOfCircle(5);
	}
}
