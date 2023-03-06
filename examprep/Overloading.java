package examprep;
import java.util.Scanner;
class Area
{
	void area(double h,double b) {
		System.out.println("Area of triangle of height "+h+ "base"+b+"is"+" "+ 0.5*b*h+"unit square");
	}
	
	void area(double l,float a) {
		System.out.println("Area of rectangle of breadth "+l+ "length"+a+"is"+" "+ l*a+"unit square");
		
		

		
	}
	void area(float c) {
		System.out.println("Area of circle of radius "+c+"is"+" "+3.14*c*c+"unit square");

	}
}

public class Overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          Area aa=new Area();
          System.out.println("Height of the triangle: ");
          double h=sc.nextDouble();
          System.out.println("Base of the triangle: ");
          double b=sc.nextDouble();
          System.out.println("Rectangle breadth: ");
          double l=sc.nextDouble();
          System.out.println("Rectangle length: ");
          float a=sc.nextFloat();
          System.out.println("radius: ");
          float c=sc.nextFloat();
          
          aa.area(h, b);
          aa.area(l, a);
          aa.area(c);
          sc.close();
          
          
          
	}

}
