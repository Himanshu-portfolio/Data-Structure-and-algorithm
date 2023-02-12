package linkedList;

public class PrintLinkedList {
	public static void printLinkedList(LinkedListAllOperations list) {
		Node current = list.head;
		int count = 0;
		while(current!=null) {
			count += 1;
			System.out.println("LinkedList ------> " + current.data);
			current = current.next;
			
		}
		System.out.println("Length ------->>>>>"+ count);
	}

}
