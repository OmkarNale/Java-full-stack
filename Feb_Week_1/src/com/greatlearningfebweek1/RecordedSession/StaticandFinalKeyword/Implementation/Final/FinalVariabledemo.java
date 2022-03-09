package com.greatlearningfebweek1.RecordedSession.StaticandFinalKeyword.Implementation.Final;

public class FinalVariabledemo {

	final int speedlimit = 80;
	
	public void run() {
	
		//speedlimit = 175; 	//ERROR :The final field FinalVariabledemo.speedlimit cannot be assigned	
		System.out.println("speedlimit :"+speedlimit);
	}
	
	public static void main(String[] args) {
		
		FinalVariabledemo object = new FinalVariabledemo();
		object.run();
	}
}
