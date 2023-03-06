package examprep;
import java.util.*;
abstract class Animal{
	int legs;
	String name;
	Animal(int legs){
	this.legs=legs;
		
	}
	abstract void walk();
	abstract void eat();
}
interface pet{
	String getName();
	String SetName(String name);
	String play();
}
 class Spider extends Animal implements pet{

	Spider(int legs) {
		super(legs);
		
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String SetName(String name) {
		return this.name=name;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		System.out.println("Spider likes to make webs");
		return null;
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Spider walks with itd 8 legs");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Spider likes to eat insects");
		
	}
	 
 }
 class cat extends Animal implements pet{

	cat(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String SetName(String name) {
		// TODO Auto-generated method stub
		return this.name=name;
	}

	@Override
	public String play() {
		System.out.println("Cats loves to play with balls");
		return null;
		
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cats walk with its 4 legs");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats likes to eat fish");
		
	}
	 
 }
 
 
public class sampleInterference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider s=new Spider(0);
		s.SetName("LOL");
		System.out.println("______________________________________________");
		System.out.println("The spider name is: "+s.getName());
		s.eat();
		s.play();
		s.walk();
		
		cat c= new cat(0);
		c.SetName("MEOW");
		System.out.println("____________________________________________________");
		System.out.println("The name of the cat is: "+c.getName());
		c.eat();
		c.play();
		c.walk();
		
		


		

		
		

	}

}
