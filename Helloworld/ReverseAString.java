package Helloworld;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String name = sc.nextLine();
		String nstr = "";
		
		for(int i=0; i< name.length() ; i++)
	     {
	  
		 char ch;
		 ch =name.charAt(i);
		 nstr= ch+nstr;
		 }
		
	  System.out.print("Reversed Word :" + nstr);
	   
	
		

	}}