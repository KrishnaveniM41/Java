package Helloworld;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("Sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
			System.out.println(s);
		fr.close();}

}