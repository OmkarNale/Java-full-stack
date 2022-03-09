package com.greatlearningfebweek1.CodingChallenge.CC4;

/***
 * @author OMKAR
 * a.Start
 * b.Create a classConstructorDemo
 * c.Create one default and one parameterized constructor
 * d.Introduce yourself in the default constructor.
 * e.In parameterized constructor, accept full name, age,location or anything neededas input arguments.
 * f.Create a main method in the same class
 * g.Create an objectobjin main method
 * h.Execute or print both constructors
 * i.Stop
 */
public class ConstructorDemo {

	public ConstructorDemo() {

		System.out.println("Hi, Team i'm omkar nale and my age is 23 i am from Aurangabad"+"Happy learing !!");
	}
	
	public ConstructorDemo(String name, int age, String location) {
		// TODO Auto-generated constructor stub
		
		System.out.println("Hi, Team i'm "+name+" and my age is "+age+" i am from "+location+", Happy learing !!");

	}
	

	public static void main(String[] args) {
		
		ConstructorDemo object1 = new ConstructorDemo();
		
		ConstructorDemo object2 = new ConstructorDemo("omkar nale", 23, "Aurangabad");	
	}
}
