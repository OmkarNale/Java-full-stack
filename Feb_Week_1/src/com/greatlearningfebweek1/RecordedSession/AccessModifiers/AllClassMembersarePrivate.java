package com.greatlearningfebweek1.RecordedSession.AccessModifiers;

class Demo {
	
	public int rollNo;
	public String name;
	
	public void mag() {
	
		System.out.println("Roll No :"+ rollNo);
		System.out.println("Name :" + name);
	}
}
public class AllClassMembersarePrivate {

	public static void main(String[] args) {
	
		Demo object = new Demo();
		
		object.rollNo = 102;
		object.name = "Omkar";
		
//		System.out.println("ROll No " + object.rollNo);
//		System.out.println("Name :"+ object.name);
		
		object.mag();
	}
	
}
