package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Static;

class Student {
	
	int rollNo;
	String name;
	
	static String Institute = "IITR";
	
	// Static method to change value of static Variable 
	static void changeInstituteName() {
		
		Institute = "IITB";
	}

	// parametric constructor
	 public Student(int r, String n) {
		 rollNo = r;
		 name = n;
	}
	 
	 // Dispaly method 
	void diaplay() {
		System.out.println("Name :"+name+"| RollNo : "+rollNo+"| Institute :"+Institute);
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		
		Student object = new Student(201, "Omkar");
		object.diaplay();
		
		Student.changeInstituteName();
		
		Student object2 = new Student(101, "Aniket");
		object2.diaplay();
		
		Student object3 = new Student(18, "Virat");
		object3.diaplay();
		
		
	}
}
