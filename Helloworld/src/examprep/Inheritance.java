package examprep;
import java.util.Scanner;
class Person{
	String name,age,add,phone,salary;
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+add);
		System.out.println("Phone number: "+phone);
		
	}
}
 
class officer extends Person{
	String specialization;
}

class manager extends Person{
	String department;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		officer of=new officer();
		System.out.println("Officer name: ");
		of.name=sc.nextLine();
		System.out.println("Officer age: ");
		of.age=sc.nextLine();
		System.out.println("Officer address: ");
		of.add=sc.nextLine();
		System.out.println("Officer phoneno: ");
		of.phone=sc.nextLine();
		System.out.println("Officer salary: ");
		of.salary=sc.nextLine();
		
		System.out.println("Enter the specialization: ");
		of.specialization=sc.nextLine();
		System.out.println("\n");
		
		manager m=new manager();
		System.out.println("Manager name : ");
		m.name=sc.nextLine();
		System.out.println("Manager age: ");
		m.age=sc.nextLine();
		System.out.println("Manager address: ");
		m.add=sc.nextLine();
		System.out.println("Manager phoneno: ");
		m.phone=sc.nextLine();
		System.out.println("Manager Salary: ");
		m.salary=sc.nextLine();
		
		System.out.println("Enter department: ");
		m.department=sc.nextLine();
		System.out.println("\n");
		
		System.out.println("*******OFFICER DETAILS************");
		System.out.println("Specialization: "+of.specialization);
		of.display();
		of.printSalary();
		System.out.println("\n");

		System.out.println("***********MANAGER DEATAILS****************");
		System.out.println("department: "+m.department);
		

		m.display();
		m.printSalary();
		
		
		
		
		
	}

}
