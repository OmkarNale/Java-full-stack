package com.greatlearningfebweek1.RecordedSession.ClassAndObject;

class MainClasss {
	
	int a;
	int b;
	
	void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	void getValues() {
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	
}
public class HowtoaccessClassMembers {

	public static void main(String[] args) {
		
		 MainClasss object = new MainClasss();
		 
		 object.a = 10;             //accessing class members
		 object.b = 20;             //accessing class members
		 object.getValues();
		 
		 object.setValue(1010, 120);  //accessing class members
		 object.getValues();         // accessing class members 
	}
}
