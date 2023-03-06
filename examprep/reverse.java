package examprep;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String rev="";
		
		Scanner sc=new Scanner(System.in);
		
			
		
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		int l=str.length();
		int i;
		for(i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string is: "+rev);
		
		 if(rev.equals(str)) {
			 System.out.println("PALINDROME");
		 }
		 else
		 {
			 System.out.println("NOT PALINDRIME");
		 }
		 int count1=0;
		 System.out.println("Enter the letter to check frequency: ");
		 
		 
		 
		 char ch=sc.nextLine().charAt(0);
		 for(i=0;i<str.length();i++)
		 {
			 if(ch==str.charAt(i))
			 {
				 count1++;
			 }
		 }
		
		 System.out.println("The frequency: "+count1);

	}

}
