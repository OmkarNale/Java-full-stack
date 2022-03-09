package com.greatlearningfebweek1.RecordedSession.AccessModifiers.Implementation;

class Demo {
	
	private int data = 40;
	private void mag() {
		
		System.out.println(data);
		System.out.println("Hello Java !!");
	}
}
public class AllClassMemebersArePrivate {

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		
//		System.out.println(" "+ object.data); //Error :The field Demo.data is not visible
		
//		object.mag(); // Error :The field Demo.data is not visible
	}
}
