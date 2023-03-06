package Lab21;
import java.util.*;


public class LinkedList {
	
	class Node{
		int item;
		Node previous;
		Node next;
		
		
		public Node(int item) {
			this.item=item;  
		}
		
	}
	Node head,tail=null;
	
	public void addnode(int item) {
		Node newNode=new Node(item);
		 if(head==null) {
			 tail=head=newNode;
			 head.previous=null;
			 tail.next=null;
			 
		 }
		 
		 else {
			 tail.next=newNode;
			 newNode.previous=tail;
			 tail=newNode;
			 tail.next=null;
			 
		 }
	}
	
	public void delNode() {
		int x=head.item;
		head=head.next;
		 System.out.println("The deleted node: "+x);
		
		
	}
	
	
	public void printNode() {
		Node current=head;
		if(head==null) {
			 System.out.println("Empty list");
			 return;
		}
		 System.out.println("Nodes of Doubly linked list: ");
		 System.out.println();
		 
		 while(current!=null) {
			 System.out.println(current.item+" ");
			 current=current.next;
		 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		boolean exit=false;
		while(!exit) {
			System.out.println("\n\t1.INSERT\n\t2.DELETE\n\t3.PRINT\n\t4.EXIT");
			 System.out.println("Enter your choice: ");
			 int choice=sc.nextInt();
			 
			 switch (choice) {
			 case 1:
				 System.out.println("enter the node to insert: ");
				 int d=sc.nextInt();
				 l.addnode(d);
				 System.out.println("Node inserted");
				 break;
				 
				 
			 case 2:
				 l.delNode();
				 break;
			 
			 
			 case 3:
				 l.printNode();
				 break;
				 
				 
			 case 4:
				 System.out.println("EXIT");
				 break;
				 
				 default:
					 System.out.println("Inavalid choice");
			 }	 
			 
		}

	}

}
