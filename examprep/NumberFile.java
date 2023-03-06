package examprep;
import java.io.*;
import java.util.Scanner;

public class NumberFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("num2.txt");
		if(f.createNewFile()) {
			 System.out.println(f.getName());
		}
		File e=new File("even2.txt");
		if(e.createNewFile()) {
			 System.out.println(e.getName());
		}
		File o=new File("odd2.txt");
		if(o.createNewFile()){
			 System.out.println(o.getName());
		}
		
		  Scanner sc=new Scanner(System.in);
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileInputStream fin=new FileInputStream("num2.txt");
		FileOutputStream fout=new FileOutputStream("num2.txt",true);
		 
		
		 System.out.println("Size of the array: ");
	
		 int n=sc.nextInt();
		 
		 System.out.println("Enter the number: ");
		
		 
		 for(int i=0;i<n;i++) {
			 
			int  s=sc.nextInt();
			
		//	int arr[]=new int[i];
			
			
			 fout.write(s);
			 
		 }
		 System.out.println("File written");
		 
		 
		
		 
		 
		 
		 FileOutputStream fe=new FileOutputStream("even2.txt");
		 FileOutputStream fo=new FileOutputStream("odd2.txt");
		 System.out.println("Contents of num.txt: ");
		 int i=0;
		 while((i=fin.read())!=-1) {
			 int c=(int)i;
			  if(c%2==0) {
				 fe.write(c);
			  }
			  else {
				  fo.write(c);
			  }
			  
			  System.out.println(c);
		 }
		 
		 
		 fin.close();
		 fo.close();
		 fe.close();
		  FileInputStream feven=new FileInputStream("even2.txt");
		  System.out.println("Contents of even.txt: ");
		  while((i=feven.read())!=-1) {
			  int c=(int)i;
			  System.out.println(c);
		  }
		  feven.close();
		  FileInputStream fodd=new FileInputStream("odd2.txt");
		  System.out.println("Contents of odd.txt: ");
		  while((i=fodd.read())!=-1) {
			  int c=(int)i;
			  System.out.println(c);
		  }
		  fodd.close();
		  
		 
		 
		 
		 
		 
		 
		 


	}

}
