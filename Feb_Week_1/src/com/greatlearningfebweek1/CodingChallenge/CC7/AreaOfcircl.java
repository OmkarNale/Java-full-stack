package com.greatlearningfebweek1.CodingChallenge.CC7;
/***
 * 
 * @author OMKAR
 *a.Start
 *b.Create a classArea
 *c.Create a final variablepiwith float as data type.
 *d.Declare variablesradiusandresultin the class withfloat as data type
 *e.Create a main method.in the same class
 *f.Create an objectareaof theAreaclass
 *g.Insert value for theradiusin the main method
 *h.Write logic in the main method to calculate the areaof a circle and store theresult in the result variable
 *i.The printresultwith pretext saying “The are of thecircle is: ”
 *j.Stop
 */
public class AreaOfcircl {
	
	final float pi = 3.14f;
	double area;
	int radius;
	
	public AreaOfcircl() {
		// TODO Auto-generated constructor stub
		radius = 0;
		area   = 0;
	}
	
	void calculate_Area(int radius) {
		
		this.radius = radius;
		
		area = (2 * pi * (radius * radius));
		System.out.println("Area of circle is : "+area+" cm");
	}
	
	public static void main(String[] args) {
		
		AreaOfcircl object = new AreaOfcircl();
		object.calculate_Area(5);
	}
}
