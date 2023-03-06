package examprep;

import java.util.Random;


class EvenThread extends Thread
{
	int n;
	EvenThread(int a)
	{
		n=a;
		
	}
	public void run() {
		int sqr=n*n;
		System.out.println("Square of the number"+" "+n+ " "+"is"+sqr);
	}
}


class OddThread extends Thread
{
	int o;
	OddThread(int a1)
	{
	o=a1;
	}

public void run() {
	int cube=o*o*o;
	System.out.println("cube of the number"+" "+o+" "+"is"+cube);
}
}

class RandThread extends Thread
{
	public void run()
	{
	Random r=new Random();
	for(int i=0;i<20;i++)
	{
		int randInt=r.nextInt(50);
		System.out.println("Random integer generated: "+randInt);
		EvenThread ee=new EvenThread(randInt);
		OddThread oo=new OddThread(randInt);
		
		if(randInt%2==0)
		{
		ee.run();
		}
		
		else if(randInt%2!=0)
		{
			oo.run();
		}
		
		try
		{
			Thread.Sleep(1000);
			}
			finally
			{
				System.out.println("End");
		
		}		

	}
}
}

public class MulThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandThread rr=new RandThread();
		rr.run();
		

	}

}
