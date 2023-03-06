package Helloworld;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculatorDemo implements ActionListener {
	static int operator=0;
	static int a=0,b=0,result=0;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bdiff,bmul,bc,beq,bdiv,bdot;
	JTextField t;
	CalculatorDemo(){
		JFrame f =new JFrame("Calculator");
		JPanel p=new JPanel();
	   p.setLayout(null);
	    t=new JTextField(20);
		t.setBounds(50,50,200,50);
        
		
		badd=new JButton("+");
		badd.setBounds(50,120,45,40);
		b1=new JButton("1");
		b1.setBounds(100,120,45,40);
		b2=new JButton("2");
		b2.setBounds(150,120,45,40);
		b3=new JButton("3");
		b3.setBounds(200,120,45,40);
		bdiff=new JButton("-");
		bdiff.setBounds(50,165,45,40);
		b4=new JButton("4");
		b4.setBounds(100,165,45,40);
		b5=new JButton("5");
		b5.setBounds(150,165,45,40);
		b6=new JButton("6");
		b6.setBounds(200,165,45,40);
		bmul=new JButton("*");
		bmul.setBounds(50,210,45,40);
		b7=new JButton("7");
		b7.setBounds(100,210,45,40);
		b8=new JButton("8");
		b8.setBounds(150,210,45,40);
		b9=new JButton("9");
		b9.setBounds(200,210,45,40);
		bdiv=new JButton("/");
		bdiv.setBounds(50,255,45,40);
	//	bdot=new JButton(".");
		//bdot.setBounds(100,255,45,40);
		b0=new JButton("0");
		b0.setBounds(100,255,45,40);
		bc=new JButton("C");
		bc.setBounds(150,255,45,40);
		beq=new JButton("=");
		beq.setBounds(200,255,45,40);
		
	
		
		
		
		
		p.add(t);
		p.add(badd);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bdiff);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bmul);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bdiv);
	
		
		p.add(b0);
		p.add(bc);
		p.add(beq);
		
		
		badd.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		bdiff.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bmul.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdiv.addActionListener(this);
	
	
		b0.addActionListener(this);
		bc.addActionListener(this);
		beq.addActionListener(this);
		
		f.setSize(500,500);
		f.setContentPane(p);
		f.setVisible(true);
		
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if(e.getSource()==b1) {
		t.setText(t.getText()+"1");
	}
	 if(e.getSource()==b2) {
			t.setText(t.getText().concat("2"));
	 }
	 if(e.getSource()==b3) {
			t.setText(t.getText().concat("3"));
	 }
	 if(e.getSource()==b4) {
			t.setText(t.getText().concat("4"));
	 }
	 if(e.getSource()==b5) {
			t.setText(t.getText().concat("5"));
	 }
	 if(e.getSource()==b6) {
			t.setText(t.getText().concat("6"));
	 }
	 if(e.getSource()==b7) {
			t.setText(t.getText().concat("7"));
	 }
	 if(e.getSource()==b8) {
			t.setText(t.getText().concat("8"));
	 }
	 if(e.getSource()==b9) {
			t.setText(t.getText().concat("9"));
	 }
	 if(e.getSource()==b0) {
			t.setText(t.getText().concat("0"));
	 }
	 if(e.getSource()==badd) {
		 
		 a=Integer.parseInt(t.getText());




		 operator = 1;
		 t.setText("");

		 }
		 if(e.getSource()==bdiff)
		 {
		 a=Integer.parseInt(t.getText());

		 operator = 2;
		 t.setText("");
		 }
		 if(e.getSource()==bmul)
		 {
		 a=Integer.parseInt(t.getText());


		 operator = 3;
		 t.setText("");
		 }
		 if(e.getSource()==bdiv)
		 {
		 a=Integer.parseInt(t.getText());

		 operator = 4;
		 t.setText("");
		 }
		 if(e.getSource()==beq)
		 {  
		 b=Integer.parseInt(t.getText());
		 switch(operator)
		 {
		 case 1: result = a+b ;
		 break;
		 case 2: result = a-b ;
		 break;
		 case 3: result = a*b ;
		 break;
		 case 4: result = a/b ;
		 break;
		 }
		 t.setText(""+result);
		 }
		 if(e.getSource()==bc)
		 {
		 t.setText("");
		 }

		 }

	
	 
	  
	 
	 
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new CalculatorDemo();
	}



}