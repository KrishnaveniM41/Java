package CoreJavaBasics;
import java.util.Scanner;
class Area
{
	void area(float b,float h)
	{
	 System.out.println("Area of the triangle with base:"+" "+b+" "+"and height:"+" "+h+" "+"is:"+" "+0.5*b*h+" "+"cm square")	;
	}
	void area(double w,double h)
	{
		System.out.println("Area of the Rectangle with width:"+" "+w+" "+"and  height:"+" "+h+" "+"is:"+" "+w*h+" "+"cm square");
	}
	void area(float r)
	{
		System.out.println("Area of the circle with radius: "+" "+r+" "+"is:"+" "+3.14*r*r+" "+"cm square");
	}
}

public class OverloadingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Area a =new Area();
		System.out.println("Enter the base of the triangle: ");
		float b=sc.nextFloat();
		System.out.println("Enter of the height the triangle: ");
		float h=sc.nextFloat();
		System.out.println("Enter the Width  of the Rectangle: ");
		double w=sc.nextDouble();
		System.out.println("Enter the height  of the Rectangle: ");
	    double he=sc.nextDouble();
	    System.out.println("Enter the radius of the circle: ");
	    float r=sc.nextFloat();
	    a.area(b,h);
	    a.area(w,he);
	    a.area(r);
	    
	    
	    
	    

	}

}
