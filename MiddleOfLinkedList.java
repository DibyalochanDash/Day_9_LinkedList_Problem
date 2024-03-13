package LinkedList;

public class MiddleOfLinkedList {
	
	public static class Node {
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	static void Display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
			System.out.println();
		}
	}
	public static Node  MiddleNodeFind(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast!=null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
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
		
		Node res = MiddleNodeFind(a);
		if (res != null) {
			System.out.println("Middle Of the Element is  : "+res.data);
		} else {
            System.out.println("Element Not Found!");
		}
		

	}

}
