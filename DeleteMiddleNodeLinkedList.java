package LinkedList;



public class DeleteMiddleNodeLinkedList {
	
	public static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
       
	static Node MiddleNodeDelete(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast.next.next != null && fast.next.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
		
	}
	  static void Display(Node head) {
		  Node temp = head;
		  while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
		  System.out.println();
	  }
	
	public static void main(String[] args) {
	
		Node a = new Node(3);
		Node b = new Node (5);
		Node c = new Node(7);
		Node d = new Node(9);
		Node e = new Node(1);
		Node f = new Node(6);
		
		a.next =b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		Display(a);
		Node res = MiddleNodeDelete(a);
		if (res != null) {
			Display(res);
		} else {
            System.out.println("Element Not Found!");
		}
	}

}
