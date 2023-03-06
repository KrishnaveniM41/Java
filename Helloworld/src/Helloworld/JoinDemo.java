package Helloworld;
class A1 extends Thread
{ 
	public void run() 
    { 
        for (int i = 1; i <= 10; i++) { 
            try 
				{ System.out.print(i + " "); 
				 Thread.sleep(1000); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            
        } 
    } 
} 
class B1 extends Thread { 
	  
    public void run() 
    { 
    for (char i = 'a'; i <= 'k'; i++) { 
        try {
        System.out.print(i + " ");
           // Thread.sleep(1000);
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
         
    } 
} 
} 

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 num1 = new A1(); 
        B1 alp1 = new B1(); 
          try { 
              alp1.start(); 
              num1.start(); 
            num1.join(); 
             //alp1.join(); 
        }         catch (Exception e) { 
            System.out.println(e); 
        } // after thread a1 execution finished 
        // then b1 thread start 
        
	}

}

//join(): It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.

//join(long millis) :It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).
//join(long millis, int nanos): It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).



