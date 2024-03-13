package LinkedList;



public class DeleteNthNodeFromEnd {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static Node nthNodeDelete(Node head,int n) {
		 if (n <= 0 || head == null) {
 	        return null; // Invalid value of n or empty list
 	    }
		
		Node slow = head;
		Node fast = head;
		for(int i = 1;i<=n;i++) {
			 if (fast == null) {
	                return head; // n is greater than the size of the linked list
	            }
			fast = fast.next;
		}
		
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		 slow.next = slow.next.next;
		return head;
	}

     static void Display(Node head) {
    	 Node  temp = head;
    	 while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
    	 System.out.println();
     }
	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(1);
		Node d = new Node(6);
		Node e = new Node(7);
        
		a.next= b;
		b.next= c;
		c.next= d;
		d.next= e;

		Display(a);
	Node res = nthNodeDelete(a,5);
	if (res != null) {
		Display(res);
	} else {
     System.out.println("Invelid Index");
	}
		

	}

}
