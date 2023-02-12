package linkedList;

 class Node {
	int data;
	Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // a non-parameterized constructor.
    Node(int data) {

    this.data = data;
    this.next = null;
	}
 }
	
public class SimpleLinkedList {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        Node current = head;
		while(current!=null) {
			System.out.println("LinkedList ------> " + current.data);
			current = current.next;
		}
	}

}
