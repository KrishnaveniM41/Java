package Helloworld;
import java.io.*;

public class FileAddContent {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("enter data");
        String buffer=br.readLine();
        FileWriter f1 = new FileWriter("smith.txt",true);
        f1.write(buffer);
        System.out.println("file contents added");
        f1.close();

	}

}
