package Lab21;
import java.util.Random;
class EvenThread extends Thread
{
	int n;
     EvenThread(int a)
	
	{
		n=a;
	}

	public void run()
	{
	
	 
	  int sqr=n*n;
	  System.out.println("Square of number "+n+" "+"is"+" "+sqr);
	 
			
		
	}
}


class OddThread extends Thread
{	
	int o;
   OddThread(int a1)
	{
		o=a1;
	}
	
	public void run()
	{
	  int cube =o*o*o;
	  System.out.println("Cube of the number "+o+" "+"is"+" "+cube);
	}
}
class RandThread extends Thread
{
public void run()
	{ 
	//create random number and check odd/even}
		Random r= new Random();
		int i;
		for(i=0;i<20;i++)
		{
			int randInteger = r.nextInt(50);
			System.out.println("Random integer Generated: "+ randInteger);
			EvenThread ee= new EvenThread(randInteger);
			OddThread oo=new OddThread(randInteger);
			if(randInteger%2==0)
			{
				ee.start();
			}
			
			else if(randInteger%2!=0)
			{
				
				oo.start();
			}
			try {

				 Thread.sleep(1000);

				} catch (InterruptedException ex) {

				 System.out.println(ex);

				}
		}
		
		
	}
	
}


public class MultiThreadingImplementationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandThread rr=new RandThread();
		rr.start();

	}

}
