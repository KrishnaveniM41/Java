package Helloworld;
import java.io.*;



public class FileWrite {
    public static void main(String[] args) throws IOException {

            FileOutputStream fout = new FileOutputStream("Sample.txt",true);
            //String s = "Hello World";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("enter data");
            String s=br.readLine();
            char ch[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                fout.write(ch[i]);
            }

    }
}