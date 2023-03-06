package examprep;

import java.io.File;
import java.io.IOException;

public class filecreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f=new File("tt.txt");
			
			
		
		if(f.createNewFile()) 
		{
			System.out.println("File created: "+f.getName());
		}
		else {
                    System.out.println("File already exits");
		}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.getStackTrace();
		}
	}

}
