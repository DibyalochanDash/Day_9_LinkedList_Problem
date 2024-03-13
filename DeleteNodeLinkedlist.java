package LinkedList;



public class DeleteNodeLinkedlist {
	public class ListNode {
		int val ;
		ListNode next;
		ListNode (int x){
			val = x;
		}
		
	}
	  public void deleteNode(ListNode node) {
	        if (node == null || node.next == null) {
	            return;
	        }
	        ListNode nextNode = node.next;
	        node.val = nextNode.val;
	        node.next = nextNode.next;
	    }

	public static void main(String[] args) {
		DeleteNodeLinkedlist solution = new DeleteNodeLinkedlist();
	        // Creating a linked list
		 DeleteNodeLinkedlist.ListNode head = solution.new ListNode(1);
		    head.next = solution.new ListNode(2);
	        head.next.next = solution.new ListNode(3);
	        head.next.next.next = solution.new ListNode(4);

	        // Printing original linked list
	        System.out.println("Original Linked List:");
	        solution.printList(head);

	        // Deleting a node
	        System.out.println("Deleting node with value 2:");
	        solution.deleteNode(head.next);

	        // Printing updated linked list
	        System.out.println("Updated Linked List:");
	        solution.printList(head);
	    }

	    public void printList(ListNode head) {
	        ListNode temp = head;
	        while (temp != null) {
	            System.out.print(temp.val + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	}

}
