package com.greatlearningfebweek1.RecordedSession.ClassAndObject;

class ClassDemo {
	
	void display() {
		
		System.out.println("Hello Java class !");
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		
		ClassDemo obj1 = new ClassDemo();  // approach 1 creating an object
		obj1.display();
		

		ClassDemo obj2;
		obj2 = new ClassDemo();  // approach 2 creating an object
		obj2.display();
	}
}
