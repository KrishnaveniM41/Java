package Helloworld;
import java.util.*;
import java.util.ArrayList;


public class AList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlstInt = new ArrayList<Integer>(); //Declaring ArrayList
        arrlstInt.add(1);
        arrlstInt.add(2);
        arrlstInt.add(3);
        arrlstInt.add(4);
        arrlstInt.add(0, 5);
        arrlstInt.add(3, 30);
       
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in List: ");
        
        int num = scanner.nextInt();
        System.out.println("Enter the number to add into the List: ");
         int a=scanner.nextInt();   

	}

}

//secnd program Al
//import java.util.*;
//import java.util.ArrayList;
//class ArrList {
  //  public static void main(String[] args) {
    //    ArrayList<Integer> numbers = new ArrayList<>();
      //  numbers.add(10);
        //numbers.add(20);
        //numbers.add(30);
      //  Scanner s=new Scanner(System.in);
        //System.out.println("Enter New Element");
 //       numbers.add(s.nextInt());
   //     System.out.println("List: " + numbers);
	//int number = numbers.get(2);
        //System.out.println("Accessed Element: " + number)