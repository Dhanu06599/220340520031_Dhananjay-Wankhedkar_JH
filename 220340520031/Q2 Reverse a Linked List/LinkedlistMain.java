class Linkedlist{
	private Node head;
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public Linkedlist()
	{
		this.head=null;
		
	}
	public boolean isListEmpty(){
		return (head==null);
		
	}
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(isListEmpty())
		{
			head = newNode;
		}
		else{
			Node trav = head;
			while (trav.next != null)
			{
				trav= trav.next;
			}
			trav.next=newNode;
		}
	}
	public void display()
	{
		if (isListEmpty())
		{
			System.out.println("The List is Empty");
		}
		else
		{
			Node trav;
			trav = head;
			while(trav != null)
			{
				System.out.printf(" %d", trav.data);
				trav= trav.next;
			}
			System.out.println();
		}
	}
	public void reverseList()
	{
		if (isListEmpty())
		{
			System.out.println("The List is Empty");
		}
		else
		{
			Node t1 = head;
			Node t2 = t1.next;
			t1.next = null;
			while (t2 != null)
			{
				Node t3 = t2.next;
				t2.next = t1;
				t1 = t2;
				t2 = t3;
			}
			head = t1;
			
		}
	}
}

public class LinkedlistMain
{
	public static void main(String [] args)
	{
		Linkedlist l1 = new Linkedlist();
		Linkedlist l2= new Linkedlist();
		l1.addLast(1);
		l1.addLast(5);
		l1.addLast(1);
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(4);
		l1.addLast(5);
		
		l1.display();
		
		l1.reverseList();
		
		l1.display();
		
		System.out.println();
		
		l2.addLast(2);
		l2.addLast(4);
		l2.addLast(3);
		l2.addLast(4);
		l2.addLast(2);
		l2.addLast(5);
		
		l2.display();
		
		l2.reverseList();
		
		l2.display();
	}
}