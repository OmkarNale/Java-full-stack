package com.greatlearningfebweek1.CodingChallenge.CC2;

/**
 * a.Start
 * b.Create package com.greatlearning.corejava
 * c.Create classesHealthandHealthDriverin the samepackage
 * d.Create an int variableage and float variablesweightandheightin class Health.
 * e.Assign values to these variables.
 * f.Useprotectedaccess modifier for all the variables.
 * g.Create main method inHealthDriverclass
 * h.Create an object of classHealthin classHealthDriver.
 * i.Print associated values with the help ofHealthclassobject.
 * j.Stop
 * */
class Health {
	
	protected int age;
	protected float weight;
	protected float bmi;
	
}
public class HealthDriver {

	public static void main(String[] args) {
		
		Health object = new Health();
		
		object.age = 23;
		object.weight = 79f;
		object.bmi = 98f;
		
		System.out.println("Age :"+object.age);
		System.out.println("weight :"+object.weight);
		System.out.println("bmi :"+object.bmi);

		
	}
}
