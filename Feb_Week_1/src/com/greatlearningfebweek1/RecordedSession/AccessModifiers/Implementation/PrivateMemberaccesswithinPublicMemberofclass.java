package com.greatlearningfebweek1.RecordedSession.AccessModifiers.Implementation;

class DemoClass {
	
	private int data = 40;
	public void mag() {
		
		System.out.println(data);
		System.out.println("Hello Java !!");
	}
}
public class PrivateMemberaccesswithinPublicMemberofclass {

	public static void main(String[] args) {
		
		DemoClass object = new DemoClass();
		
//		System.out.println(" "+ object.data); //Error :The field Demo.data is not visible
		
		object.mag(); 
	}
}
