package Helloworld;

//ITERATOR
import java.util.Iterator;
import java.util.ArrayList;
public class IteratorDemo //Arrlist
{ public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    System.out.println("ArrayList: " + animals);
Iterator itr=animals.iterator();  
while(itr.hasNext()){  
	System.out.println(itr.next());  
}  
}}