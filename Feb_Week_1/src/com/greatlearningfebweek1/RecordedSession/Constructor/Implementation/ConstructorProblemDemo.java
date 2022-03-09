package com.greatlearningfebweek1.RecordedSession.Constructor.Implementation;

public class ConstructorProblemDemo {

	public ConstructorProblemDemo() {
		// TODO Auto-generated constructor stub
	
		System.out.println("Constructor i created !!");
	}
	
	public static void main(String[] args) {
		
//		ConstructorProblemDemo object = new ConstructorProblemDemo();
		 
		ConstructorProblemDemo object;           // Error : The local variable object may not have been initialized

		System.out.println(object);
	}
}
