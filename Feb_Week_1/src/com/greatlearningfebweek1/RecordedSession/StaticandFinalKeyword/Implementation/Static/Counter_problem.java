package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Static;

public class Counter_problem {

	int count = 0;
	
	public Counter_problem() {
		
		count++;
		System.out.println("Count :"+count);
	}

	public static void main(String[] args) {
		
		
		Counter_problem obj1 = new Counter_problem();
		
		Counter_problem obj2 = new Counter_problem();
	}
}
