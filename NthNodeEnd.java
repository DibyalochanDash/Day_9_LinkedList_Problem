package LinkedList;


public class NthNodeEnd {
	
	public static Node nthNode(Node head,int n) {
		
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if(n < 1 || n > size) {
			return null;
		}
		int m = size - n +1;
		temp = head;
		for(int i = 1;i<=m-1;i++) {
			temp = temp.next;
		}
		return temp;
	}
    public static Node nthNode2(Node head,int n) { // Another Method To Solve  Problem Easy Way
    	 if (n <= 0 || head == null) {
    	        return null; // Invalid value of n or empty list
    	    }
    	    
    	Node slow = head;
    	Node fast = head;
    	for(int i = 1;i<=n;i++) {
    		 if (fast == null) {
    	            return null; // n is greater than the size of the linked list
    	        }
    		fast = fast.next;
    	}
    	
    	while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
    	return slow;
    }
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
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
		
		Node res = nthNode(a,2);
		if (res != null) {
			System.out.println(res.data);
		} else {
           System.out.println("Invelid Index");
		}
		
		Node ress = nthNode2(a,0);
		if (ress != null) {
			System.out.println(ress.data);
		} else {
           System.out.println("Invelid Index");
		}
		
	}


}
