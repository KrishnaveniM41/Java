package examprep;
import java.util.*;


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fnum,snum;
		String a;
		do {
			System.out.println("Program to perform division\n");
			try {
			     System.out.println("Enter the first number: ");
				fnum=sc.nextInt();
			     System.out.println("Enter the second number: ");
			     snum=sc.nextInt();
			     System.out.println("RESULT= "+(fnum/snum));
			}
			   
			
			catch(ArithmeticException e) {
				System.out.println("Error");
			}
			
			
			finally{
			     System.out.println("\nEnd of operaation");

			}
			

		     System.out.println("Do you want to continue\n\nTo continue press Y\nTo End press N: ");
		     a=sc.next();

				
			
		}
		while(a.equalsIgnoreCase("Y"));

	}

}
