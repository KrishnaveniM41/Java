package Lab21;
import java.util.*;
public class StringTokeniser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//	int num;
	//int sum=0;
	
	System.out.println("Enter the String: ");
	String s=sc.nextLine();
	StringTokenizer t=new StringTokenizer(s," ");
	while(t.hasMoreTokens()) {
		String st=t.nextToken();
		
		System.out.println(st);
		
		
	}
	//System.out.println("Sum is: "+sum);
	    }
	}