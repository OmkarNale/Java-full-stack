package com.greatlearningfebweek1.RecordedSession.Constructor;

class Pen {

	String name;
	
	Pen(String name ){
		
		this.name = name;
		System.out.println("Then pen cost is 15 $");
		System.out.println("The name of pen is " + name);
	}
	
	Pen(String name, String company) {
		
		this.name = name;
		
		System.out.println("Then pen cost is 15 $");
		System.out.println("Then name of pen is " + name);
		System.out.println("The name of company is "+company);
		
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Pen object = new Pen("Yes");
		
		Pen objectks = new Pen("Yes","Parker");
		
	}
}
