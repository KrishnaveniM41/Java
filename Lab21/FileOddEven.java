package Lab21;
 import java.io.*;
import java.util.Scanner;

public class  FileOddEven{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("nums.txt");
		f.createNewFile();
		File f1=new File("oddd.txt");
		f1.createNewFile();
		File f2=new File("evenn.txt");
		f2.createNewFile();
		
		FileOutputStream fout = new FileOutputStream("nums.txt",true);
        Scanner obj =new Scanner(System.in);
        System.out.println("size of array:");
        int n=obj.nextInt();
        
        System.out.println("enter the no.s:");
        
        for (int i = 0; i < n; i++) 
        {
        	int s=obj.nextInt();
        	fout.write(s);
        }
       int i;
    	FileInputStream fin = new FileInputStream("nums.txt");
    	FileOutputStream fe = new FileOutputStream("evenn.txt",true);
		FileOutputStream fo = new FileOutputStream("oddd.txt",true);
		System.out.println("Contents of number.txt: ");
		while((i=fin.read())!=-1) {
			
	    int c = (int)i;
		if(c%2==0)
		{
			fe.write(c);
		}
		else
			fo.write(c);
		System.out.println(c);
		}
		fin.close();
		fe.close();
		fo.close();
		FileInputStream feven = new FileInputStream("evenn.txt");
		System.out.println("Contents of even.txt: ");
		while((i=feven.read())!=-1) {

			int c = (int)i;
		System.out.println(c);
		}feven.close();
		FileInputStream fodd = new FileInputStream("oddd.txt");
		System.out.println("Contents of odd.txt: ");
		while((i=fodd.read())!=-1) {
			
		int c = (int)i;
		System.out.println(c);
		}fodd.close();
		
		
	}

}