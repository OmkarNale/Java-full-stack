package com.greatlearningfebweek1.RecordedSession.Constructor.Implementation;

class Addition {
	
	static int add(int a, int b) {
		
		return ( a + b );
	}
	
	static int add(int a, int b, int c) {
		
		return ( a + b + c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Addition of :"+Addition.add(10, 20));
		
		System.out.println("addititon of :"+Addition.add(20, 30, 50));
	}
}
