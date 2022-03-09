package com.greatlearningfebweek1.RecordedSession.ClassAndObject.Implementation;

class StudentInformation {

	int id;
	String name;

	void insertValues(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(" Name :" + name + " id : " + id);
	}
}
public class InitializationThrougthMethod {

	public static void main(String[] args) {
		
		StudentInformation obj1 = new StudentInformation();
		StudentInformation obj2 = new StudentInformation();

		
		obj1.insertValues(101, " Omkar");
		obj1.display();
		
		obj2.insertValues(202, " Rajan");
		obj2.display();
	}
}
