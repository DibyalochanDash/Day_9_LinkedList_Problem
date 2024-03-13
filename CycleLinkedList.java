package LinkedList;



public class CycleLinkedList {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}	
	}
	static boolean CycleLinkedList(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast!= null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
		
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
		f.next = b;
		
     CycleLinkedList(a);
     
     boolean hasCycle = CycleLinkedList(a);
     if (hasCycle)
         System.out.println("The linked list has a cycle.");
     else
         System.out.println("The linked list doesn't have a cycle.");
		
	}
 
  
	}


