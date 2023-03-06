package examprep;
import java.util.Scanner;
class bankAcc{
	
	String name,type,phone,balance;
	int accno;
	void details()
	{
		System.out.println("Account name: "+name);
	     System.out.println("Account Type: "+type);
	     System.out.println("Account no: "+accno);
	     System.out.println("Phone no: "+phone);
	     System.out.println("Balance: "+balance);

	}
	
	void search(bankAcc[] num , int accNum2,int n) {
		int k=0;
		for(int i=0;i<n;i++) {
			if(num[i].accno == accNum2) {
				num[i].details();
				k=1;
			}
		}
		
		if(k!=1) {
			System.out.println("Invalid Account no: ");
		}
		
		
	}
	
	
	void deposit(bankAcc[] num,int accNum3,int n) {
		int k=0;
		for(int i=0;i<n;i++) {
			if(num[i].accno == accNum3) {
				k=1;
				num[i].details();
			}
		}
		
		int dep;
	}
	
	

	
	
		 
	 


	
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
