package Helloworld;
class animal
{
	String name;
	animal(String n)
	{
		name=n;
	}
	void eat()
	{
		System.out.println(name+" is Eating");
	}
}
class dog extends animal
{
	String name;
	dog(String n)
	{
		super(n);
		name=n;
	}
	void bark()
	{
		System.out.println(name+ " is Barking");
	}
}
class pup extends dog
{
	String name;
	pup(String n)
	{
		super(n);
		name=n;
	}
	void weep()
	{
		System.out.println(name+" is Weeping");
		
	}
}
public class MultilevelInheritance {
	public static void main(String args[])
	{
		pup ob=new pup("Tiger");
		ob.weep();
		ob.bark();
		ob.eat();
	}

}
