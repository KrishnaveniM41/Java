package examprep;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
		try {
			File f=new File("tt1.txt");
			
			
			
			if(f.createNewFile()) 
			{
				System.out.println("File created: "+f.getName());
			}
			else {
	                    System.out.println("File already exits");
			}
			Scanner sc=new Scanner(System.in);
			
		
		FileOutputStream fout=new FileOutputStream("tt1.txt",true);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Enter data: ");
			String s=br.readLine();
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				fout.write(ch[i]);
			}
			
			System.out.println("data added");
		int i=0;
		FileInputStream finp= new FileInputStream("tt1.txt");
		System.out.println(finp.available());
		while((i=finp.read())!=-1) {
			char c=(char)i;
			System.out.println(c);
			
		}
		byte[] array=new byte[100];
		FileInputStream sf= new FileInputStream("tt1.txt");
		FileOutputStream df=new FileOutputStream("tt_t1.txt",true);
		sf.read(array);
		df.write(array);
		System.out.println("\nFile copied to new file\n");
		sf.close();
		df.close();
		
		System.out.println("File copied");
		FileReader fr=new FileReader("tt_t");
		BufferedReader bbr=new BufferedReader(fr);
		int si;
		while((si=bbr.read())!=0) {
			System.out.println(si);
		}
		fr.close();
		}
			
		
			
		
		
		catch(IOException e) {
			System.out.println("An error occured");
			e.getStackTrace();
		}
		
		
		
	}

}
