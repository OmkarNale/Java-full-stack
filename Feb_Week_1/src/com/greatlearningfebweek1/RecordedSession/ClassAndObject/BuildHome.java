package com.greatlearningfebweek1.RecordedSession.ClassAndObject;

class Home {
	
	static int count = 0;
	int length;
	int breadth;
	
	public void designRoom(int length, int breadth) {
		
		this.breadth = breadth;
		this.length = length;
		
		count++;
		System.out.println(" Room no: "+count+" with length :"+length+" breadth is :"+breadth);
	}
	
	public void designkitchen(int length, int breadth) {
		
		this.breadth = breadth;
		this.length = length;
		
		System.out.println(" Kitchen with length :"+length+" breadth is :"+breadth);
	}
	
	
}

public class BuildHome {

	public static void main(String[] args) {
		
		Home firstfloor = new Home();  // Approch 1 object of home class
		
		Home secondfloor;
		secondfloor = new Home();  // Approch 2 object of home class
		
		firstfloor.designRoom(600,900);
		firstfloor.designkitchen(300, 300);
		
		secondfloor.designRoom(200, 440);
		secondfloor.designkitchen(500, 300);
	}
}
