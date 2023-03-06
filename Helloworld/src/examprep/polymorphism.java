package examprep;
abstract class shape{
	abstract void numberofShapes();
}
class Rectangle extends shape{
	

	@Override
	void numberofShapes() {
		// TODO Auto-generated method stub
		System.out.println("I am Rectangle,I have 4 sides");
		
	}
}
class Triangle extends shape{

	@Override
	void numberofShapes() {
		// TODO Auto-generated method stub
		System.out.println("I am Triangle,I have 3 sides");
	}
	
}

class Hexagon extends shape{

	@Override
	void numberofShapes() {
		// TODO Auto-generated method stub
		System.out.println("I am Hexagon,I have 6 sides");
	}
	
	
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.numberofShapes();
		Triangle t=new Triangle();
		t.numberofShapes();
        Hexagon h=new Hexagon();
        h.numberofShapes();
	}

}
