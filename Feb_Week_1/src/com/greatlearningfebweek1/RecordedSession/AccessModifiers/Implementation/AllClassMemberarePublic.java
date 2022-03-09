package com.greatlearningfebweek1.RecordedSession.AccessModifiers.Implementation;

class DemoClassData {
	
	public int data = 40;
	public void mag() {
		
		System.out.println(data);
		System.out.println("Hello Java !!");
	}
}

public class AllClassMemberarePublic {

	public static void main(String[] args) {
		
		DemoClassData object = new DemoClassData();
		
		System.out.println(object.data); 
		
		object.mag(); 
	}
}
