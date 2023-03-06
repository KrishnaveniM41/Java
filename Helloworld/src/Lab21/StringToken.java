package Lab21;
import java.io.*;
import java.util.*;

public class StringToken {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String rev="";
		
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
 
		   
		System.out.println("The reversed string is: "+rev);
		if(s.equals(rev)) {
		
		System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
		
		System.out.println("The letter : ");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i));
			count++;
			
		}
		System.out.println("The frequenzy : "+count);
		
		
		
		StringTokenizer t=new StringTokenizer(s, " ");
		System.out.println("\n\n");
		System.out.println("Tokenized form: ");
		while(t.hasMoreTokens()) {
			String st=t.nextToken();
			System.out.println(st);
		}
		System.out.println("\n\n");
		
		File f= new File("string.txt");
		f.createNewFile();
		System.out.println("File created: "+f.getName());
		FileInputStream fin=new FileInputStream("string.txt");
		FileOutputStream fout=new FileOutputStream("string.txt",true);
		
		char ch1[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			fout.write(ch1[i]);
		}
		  int i;
		while(( i=fin.read())!=-1) {
			char c=(char)i;
			System.out.println(c);
		}
		
}
		 
		 
		 
		
	}


