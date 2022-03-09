package com.greatlearningfebweek1.CodingChallenge.CC5;

public class ConstructorDemo {
	
	int square;
	public ConstructorDemo() {

		// your code here...
		System.out.println("I am default constructor !!");
	}

	public ConstructorDemo(int number, float percentage, String name, char c) {

		// your code here...
		System.out.println("I am Parameterized constructor. I take various arguments as input.");

		square = number * number;
		System.out.println("number :"+square);
		
		System.out.println("percentage :"+(percentage * percentage));
		
		System.out.println("name :"+name);
		System.out.println("charactor c :"+c);
    }

	public void observations() {

		System.out.println("inside Observations method");

	}

	public static void main(String[] args) {

		// your code here...
		
		ConstructorDemo obj = new ConstructorDemo();		
		ConstructorDemo obj2 = new ConstructorDemo(10, 2.5f, "Omkar", 'c');
	}

}