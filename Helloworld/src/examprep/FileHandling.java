package examprep;
import java.io.*;

public class FileHandling {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		File fn=new File("Krishnav.txt");
		if(fn.createNewFile())
		{
		     System.out.println("File created: "+fn.getName());

		}
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		FileInputStream fin=new FileInputStream("Krishnav.txt");
		FileOutputStream fout=new FileOutputStream("Krishnav.txt",true);
		
	     System.out.println("Enter data: ");
	     String s=br.readLine();
	     char ch[]=s.toCharArray();
	     
	     for(int i=0;i<s.length();i++) {
	    	 fout.write(ch[i]);
		    

	     }
	     
	     System.out.println("Content added");
	     int i=0;
	     System.out.println(fin.available());
	     while((i=fin.read())!=-1) {
	     char c=(char)i;
		     System.out.println(c);
		    


	     }
	  byte[] array=new byte[50];
	     FileInputStream ff=new FileInputStream("Krishnav.txt");
	     FileOutputStream oo=new FileOutputStream("copy1.txt",true);
	     ff.read(array);
	     oo.write(array);
	     
	     
	     
	     
	     System.out.println("File copied  ");
	     
	     ff.close();
	     oo.close();
	     
	     FileReader fr=new FileReader("copy1.txt");
	     BufferedReader b=new BufferedReader(fr);
	     String si;
	     while((si=b.readLine())!=null) {
	    	 System.out.println(si+"\n");
	    	
		     

	    	 
	     }
	     
	     
	    


		
	     
	     
		
		

	}

}
