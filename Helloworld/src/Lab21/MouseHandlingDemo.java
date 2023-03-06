package Lab21;
import java.awt.*;
import java.awt.event.*;


public  class MouseHandlingDemo extends Frame implements MouseListener,MouseMotionListener {
  
	


	public  MouseHandlingDemo() {
		
			//setting frame
			   setSize(400,400);
		 	   setVisible(true);
			//close button
		   	addWindowListener(new WindowAdapter() {
		        public void windowClosing(WindowEvent we) {
		          System.exit(0);
		        }
		     	});
			//registering sourse and listener
			
			addMouseListener(this);
			addMouseMotionListener(this);
		
		

	}
	

public void mousePressed(MouseEvent e){
	setBackground(Color.red);
	System.out.println("Mouse is Pressed");
		setTitle("Mouse Pressed");
	}

	public void mouseReleased(MouseEvent e){
		setBackground(Color.yellow);
		System.out.println("Mouse is Released");
	    setTitle("Mouse Released");
	}
	
	public void mouseClicked(MouseEvent e){
		setBackground(Color.orange);
		System.out.println("Mouse is clicked");
	    setTitle("Mouse clicked");
	}
	
	public void mouseEntered(MouseEvent e){
		setBackground(Color.magenta);
		System.out.println("Mouse is Entered");
		setTitle("Mouse Entered");
	    
	}
	public void mouseExited(MouseEvent e){
		setBackground(Color.pink);
		System.out.println("Mouse is Exited");
		setTitle("Mouse Exited");
		
		
	}
	public void mouseMoved(MouseEvent e) 
	{
		Graphics g=getGraphics();
		setBackground(Color.green);
		String txt ="Hi my mouse is moved";
		System.out.println("Mouse is moved");
		g.drawString(txt,e.getX(),e.getY());
		setTitle("Mouse Moved");
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=getGraphics();  
	    g.setColor(Color.blue);  
	    System.out.println("Mouse Dragged");
	    g.fillOval(e.getX(),e.getY(),10,10);  
	    setTitle("Mouse dragged");
	  
	}  
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new MouseHandlingDemo ();
	}
	}
	



