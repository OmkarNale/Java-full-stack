package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Static;

public class CalculateCube {

	static int cube(int x) {
		
		return (x*x*x);
	}
	
	public static void main(String[] args) {
		
		int result = CalculateCube.cube(5);
		
		System.out.println("Cuble of 5 is :"+result);
	}
}
