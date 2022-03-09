package com.greatlearningfebweek1.RecordedSession.ClassAndObject.Implementation;

class Student {
	
	int id;
	String name;
}
public class InitializationthrougthRefrence {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.id = 101;
		s1.name = "Omkar Nale";
		
		System.out.println(s1.id + " : " + s1.name);
	}
}
