package com.greatlearningfebweek1.RecordedSession.AccessModifiers;

class Test {
	
	public int rollNo;                      // Access modifier public
	private String name;                    // Access modifier private
	
	public void mas() {
		
		System.out.println("ROll no :"+rollNo);
		System.out.println("Name :"+name);

	}
}
public class AccessModifiersDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello Team !!");
		
		Test object = new Test();
		
		object.rollNo = 101;
		
//		object.name = "Hello";             Error : We cant access Private member outside the class
		
		object.mas();
	}
}
