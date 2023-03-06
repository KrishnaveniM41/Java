package Lab21;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingD {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File fin = new File ("sample.txt");
		if(fin.createNewFile())
		{
			System.out.println("file created");
		}
		else
		{
			System.out.println("file exits");
		}
		FileOutputStream fout1=new FileOutputStream("sample.txt",true);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		   System.out.println("enter data");
		   String s=br.readLine();
		char ch[] = s.toCharArray();
		   for (int i = 0; i < s.length(); i++) 
		   {
			   	fout1.write(ch[i]);   
		   }
			int i=0;
			FileInputStream fi = new FileInputStream("sample.txt");
			System.out.println(fi.available());
			while((i=fi.read())!=-1) 
			{
				char c = (char)i;
				System.out.print(c);
			}
			 byte[] array = new byte[50];
			  FileInputStream sourceFile = new FileInputStream("sample.txt");
			  FileOutputStream destFile = new FileOutputStream("new_sample.txt",true);
		      // reads all data from input.txt
		      sourceFile.read(array);

		      // writes all data to newFile
		      destFile.write(array);
		      System.out.println("\nThe file is copied to new File.");

		      // closes the stream
		      sourceFile.close();
		      destFile.close();
				System.out.println("The copied file");
				
				FileReader fr = new FileReader ("new_sample.txt");
				BufferedReader b = new BufferedReader(fr);
				String si;
				while((si = b.readLine()) != null)
				{
					System.out.println(si);
				}
				fr.close();
			}

	}

