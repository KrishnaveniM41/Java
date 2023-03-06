package Helloworld;
import java.util.*;
class Table
{    synchronized void printTable(int n)

	//synchronized(this){

	

	
      {  
       for(int i=1;i<=10;i++)
        {  
         System.out.println(n+"*"+i+"="+n*i);  
         try
	{  
         Thread.sleep(400);  
         }
         catch(Exception e)
         {
        	 System.out.println(e);
	}  
       }  
      }//}   
 } 
class table1 extends Thread
{  
	int num;
	Table t;  
   table1(Table t,int num)
   {  
	   this.t=t;  
	   this.num=num;
   }  
   public void run()
   {  
   t.printTable(num);  
   }       
} 
public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t;
		Table obj=new Table();
		System.out.println("Enter the table to be run by thread1:");
		t=sc.nextInt();
		 table1 t1=new  table1(obj,t);
		 System.out.println("Enter the table to be run by thread2: ");
		 t=sc.nextInt();
		 table1 tt=new  table1(obj,t);
		 System.out.println("Enter the table to be run by thread3: ");
		 t=sc.nextInt();
		 table1 ttt=new  table1(obj,t);
		   t1.start();  
		   tt.start();  
		   ttt.start();
		
		}

}
