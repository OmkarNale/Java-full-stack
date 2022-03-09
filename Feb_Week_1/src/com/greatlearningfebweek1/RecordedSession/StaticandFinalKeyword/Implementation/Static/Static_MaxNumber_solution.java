package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Static;

public class Static_MaxNumber_solution {

	static int count = 10;
	static int i = 5;
	
	public static void main(String[] args) {
		
		while(count-- > 0) {
			checkCount();
		}
	}
		
	public static void checkCount() {

		//int i = 5;
		i++;
		System.out.println(i+" "+count);
	}
	
	
}