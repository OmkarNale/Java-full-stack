package com.greatlearningfebweek1.RecordedSession.Constructor;

class Constructorpara {
	
	public Constructorpara(int data) {                           //parametrized constructor 
		// TODO Auto-generated constructor stub                           
		
		this.data = data;
	}
	
	public int data = 1994;
	public void mag() {
		
		System.out.println(data);
		System.out.println("Hello Java !!");
	}
}
public class SimpleParametrizedConstructor {

	public static void main(String[] args) {
		
		Constructorpara object = new Constructorpara(1010);
		
		System.out.println(object.data);
		
		object.mag();
	}
}
