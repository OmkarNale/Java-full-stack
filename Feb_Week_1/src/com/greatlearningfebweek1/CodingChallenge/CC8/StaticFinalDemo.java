package com.greatlearningfebweek1.CodingChallenge.CC8;
/**
 * 1. Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
 * 2. create two methods method1 and method2.
 * 3. In method1, use increment operator to increment var1 and use print statement to print var1.
 * 4. Similarly perform for method2 with var2.
 * 5. Create three objects obj1, obj2, obj3
 * 6. Execute method1 with all the objects.
 * 7. Similarly perform for method2.
 * (Optional) Replace static with final for var2 and run the program. Note your observations.*/

public class StaticFinalDemo {

	// Your code here...
	int var1 = 10;
	static int var2 = 10;
	
	public void method1() {
		
		var1++;
		System.out.println(var1);
	}
	
	public void method2() {
		
		var2++;
		System.out.println(var2);
	}
   public static void main(String[] args) {

        // your code here...
	   StaticFinalDemo obj1 = new StaticFinalDemo();
	   StaticFinalDemo obj2 = new StaticFinalDemo();
	   StaticFinalDemo obj3 = new StaticFinalDemo();
	   
       System.out.println("Using non-static keyword");

       // your code here for method1
       obj1.method1();
       obj2.method1();
       obj3.method1();

       System.out.println("\nUsing static keyword");
      

       // your code here for method2
       obj1.method2();
       obj2.method2();
       obj3.method2();
       
   }

}