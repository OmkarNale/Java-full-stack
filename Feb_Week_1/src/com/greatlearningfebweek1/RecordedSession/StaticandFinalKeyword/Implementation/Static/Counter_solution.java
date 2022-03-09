package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Static;

public class Counter_solution {

	static int counter = 0;
	
	 public Counter_solution() {	
		 counter++;
		 System.out.println("Counter :"+counter);
	 }
	 
	 public static void main(String[] args) {
	
		 Counter_solution obj1 = new Counter_solution();
		 
		 Counter_solution obj2 = new Counter_solution();
		 
	}
}
