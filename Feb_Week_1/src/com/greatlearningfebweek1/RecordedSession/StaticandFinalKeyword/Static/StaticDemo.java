package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Static;

public class StaticDemo {

	//static variable
	static int height = 20;
	static int width = 15;
	
	//static method
	static float calculateVolume(float depth) {
		
		if((height == 0) || (width == 0) || (depth == 0)) {
			
			return 0f;
		}
		
		float volume = height * width * depth;
		return volume; 
	}
	
	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		
		System.out.println("Volume is :"+obj.calculateVolume(2));
	}
	
}
