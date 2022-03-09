package com.greatlearningfebweek1.RecordedSession.Constructor.Implementation;

class Perimeter {

	int length;
	int breadth;
	
	//Default constructor
	public Perimeter() {
		length = 0;
		breadth = 0;
	}
	
	//parameterized constructor	
	Perimeter(int length, int breadth) {
		
		this.breadth = breadth;
		this.length = length;
	}
	
	//Method to calculate perimeter
	void calculate_Perimeter() {
		
		int peri;
		
		peri = 2 * ( length + breadth );
		
		System.out.println("The perimeter of retangle is :"+peri);
	}
}
public class ParameterizedconstructorDemo {

	public static void main(String[] args) {
		
		// Obejct 1 
		Perimeter object1 = new Perimeter();
		
		object1.calculate_Perimeter();
		
		// object 2
		Perimeter object2 = new Perimeter(10,20);
		
		object2.calculate_Perimeter();
	}
}
