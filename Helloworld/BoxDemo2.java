package Helloworld;


   class  Box
   
   {
   
   
   
	double width;
	double height;
	double  depth;
	
	 void Volume (double h,double w,double d )
	 {
		 width=w;depth=w;height=h;
		 System.out.println("Volume= "+ (width*height*depth));
		 System.out.println("Volume= " +(w*h*d));
	 }
   }

   
public class BoxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 =new Box();
		b1.Volume(10,2, 3);
		
		

	}}

