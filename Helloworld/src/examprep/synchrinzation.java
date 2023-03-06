package examprep;
import java.util.*;
class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try{
				Thread.Sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class table1 extends Thread
{
		int num;
		Table t;
		table1(int num,Table t) {
			this.t=t;
			this.num =num;
			
		}
		public void run() {
			t.printTable(num);
		}
			
		 
}

public class synchrinzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t;
		Table tt=new Table();
		System.out.println("Enter the first table: ");
		t=sc.nextInt();
		table1 t1=new table1(t, tt);
		System.out.println("Enter the second table: ");
		t=sc.nextInt();
		table1 t2=new table1(t,tt);
		System.out.println("Enter the third table: ");
		t=sc.nextInt();
		table1 t3=new table1(t,tt);
		
		t1.run();
		t2.run();
		t3.run();
	


		
		

	}

}
