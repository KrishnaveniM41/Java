package Helloworld;
import java.util.Scanner;

public class palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String rev="";
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String : ");
		str=sc.nextLine();
		int length = str.length();
		int i;
		for(i=length-1;i>=0;i--)

		{
		rev=rev +str.charAt(i);
		}


		if(rev.equals(str)) {

		System.out.println(str +" is a palindrome");}


		else
		System.out.println(str +" is not a palindrome");
		}

}








		



	


