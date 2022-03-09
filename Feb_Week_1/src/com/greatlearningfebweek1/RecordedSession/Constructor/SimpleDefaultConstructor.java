package com.greatlearningfebweek1.RecordedSession.Constructor;

class ConstructorDemo {
	
	public ConstructorDemo() {                           //Defalut constructor 
		// TODO Auto-generated constructor stub                           
		
		data = 000;
	}
	
	public int data = 1994;
	public void mag() {
		
		System.out.println(data);
		System.out.println("Hello Java !!");
	}
}

public class SimpleDefaultConstructor {

	public static void main(String[] args) {
		
		ConstructorDemo object = new ConstructorDemo();
		
		System.out.println(object.data);
		
		object.mag();
		
	}
}
