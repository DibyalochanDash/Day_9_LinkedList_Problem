package LinkedList;

public class IntersectionOfTwoLinkedList { //Finding Two Intersection Node
    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
       Node tempA = headA;
       Node tempB = headB;
       
       int countA = 0;
       while (tempA != null) {
		countA++;
		tempA = tempA.next;
	}
       int countB = 0;
       while (tempB != null) {
		countB++;
		tempB = tempB.next;
	}
 
    	tempA = headA;
    	tempB = headB;
    	
    	if  (countA > countB) {
			int step = countA - countB;
			for(int i = 1;i<=step;i++) {
				tempA = tempA.next;
			}
		}
    	else{
			int step = countB - countA;
			for(int i = 1;i <=step;i++) {
				tempB = tempB.next;
			}
		}
    	while (tempA != tempB) {
			tempA = tempA.next;
			tempB = tempB.next;
		}
    	
    	return tempA;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        
        f.next = g;
        g.next = h;
        h.next = d ; // Intersection point

        Node res = getIntersectionNode(a, f);

        if (res != null)
            System.out.println("Intersection Node Value: " + res.data);
        else
            System.out.println("No intersection node found.");
        
        
	}

}
