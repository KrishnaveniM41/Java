package Helloworld;
import java.util.Scanner;
interface food
{
	
	 double calculateprice();
	 void setType(String st);
}

class pizza   implements food{
	 String name;
	 String type;
	 String size;
	 double price;
	
	
	

	public void setType(String st) {
		type=st;
	}
	public void setSize(String s) {
		size =s;
	}

	
	

	 public double calculateprice() {
		

		
		if(size =="Small" && type == "veg") {
		    price = 80;
			}
		else if(size=="Small" && type=="Nonveg" ) {
			price=125;
			}
		else if(size=="Medium" && type=="veg") {
			price = 175;
		}
		else if(size=="Medium" && type== "Nonveg") {
			price= 225;
		}
		else if(size == "Large" && type=="veg") {
			   price=250;
		}
		else if(size == "Large" && type == "Non-Veg"){
			price =275;
		}
	return price;
		
	}

	
	
 }
class Lasagne  implements food{
	float price;
	String type;
	
	public void setType(String st) {
	 	type=st;
	}
	
	public double calculateprice() {
	
		
		if(type=="veg") {
			price =200;
		}
		else {
			price=300;
		}
		return price;

	}

	

}


public class RestaurantProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		pizza pp =new pizza();
		Lasagne ll=new Lasagne();
        
		System.out.println("***********************MENU*****************************");
		System.out.println("Order food: "+"\n1.Pizza\n2.Lasagne");
		System.out.println("*********************************************************");
        int n=sc.nextInt();
        if(n==1) {
        	  System.out.println("Enter the size of the pizza: "+"\n1.Small\n2.Medium\n3.Large");
        	  int n1=sc.nextInt();
        	   if(n1==1)
        	   {
        		   pp.setSize("Small");
        	   }
        	   else if(n1==2)
        	   {
        		   pp.setSize("Medium");
        	   }
        	   else if(n1==3)
        	   {
        		   pp.setSize("Large");
        	   }
        
        	   
        	   
              
              System.out.println("Enter Type: "+"\n1.Veg\n2.Nonveg");
              int n2=sc.nextInt();
                if(n2==1) {
                	         pp.setType("veg");	   
                         }
                else{
                	         pp.setType("NonVeg");
                           }
                
                
                
                
                 System.out.println("*********************************************************");
                System.out.println("*********************************************************");
                System.out.println("Pizza Type: "+ pp.type);
                System.out.println("Pizza Size: "+pp.size);
                System.out.println("Total amount:Rs."+pp.calculateprice());
                System.out.println("*********************************************************");
                System.out.println("*********************************************************");
                System.out.println("Thanku for Ordering...Enjoy Your Food");
                System.out.println("*********************************************************");
        }
	 
        if(n==2)
        {
        	System.out.println("Type: "+"\n1.veg\n2.Nonveg");
        	int m =sc.nextInt();
        	if(m==1) {
        		ll.setType("veg");
        	}
        	else if (m==2){
        		ll.setType("Nonveg");
        	}
        	
        	
        	
        	System.out.println("*********************************************************");
        	System.out.println("*********************************************************");
        	System.out.println("Lasagne type: "+ll.type);
        	System.out.println("Total Price: "+ll.calculateprice());
        	System.out.println("*********************************************************");
        	System.out.println("*********************************************************");
            System.out.println("Thanku for Ordering...Enjoy Your Food");
            System.out.println("*********************************************************");
        	
        }
       
	
	

	
	}}


