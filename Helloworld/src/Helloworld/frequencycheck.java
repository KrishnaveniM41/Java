package Helloworld;
import java.util.Scanner;

public class frequencycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string value : ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		System.out.println("Enter a particular character : ");
		char character =sc.nextLine().charAt(0);
		int count=0;

		for(int i=0;i<str.length();i++)
		{
		if(character==str.charAt(i))
		{
		count++;
		}
		}

		  System.out.println("Frequency of the given character= " +count);
		}

		}


	
