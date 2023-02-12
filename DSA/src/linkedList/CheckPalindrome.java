package linkedList;


// creating a linked list node.
public class CheckPalindrome {
	static Node reverseList(Node head)
    {
        // code here
      if(head.next == null) {
				return head;
			}else {
				Node previous = null;
				Node current = head;
				Node temp = null;
				while(current!=null) {
					temp = current.next;
					current.next = previous;
					previous = current;
					current = temp;
				}
				head = previous;
				return head;
			}
    }
    // a function that will check if the linked list is a palindrome linked list or not.
    static boolean checkPalindrome(Node head) {
        // a pointer that will help us to traverse the linked list.
    	boolean status = true;
        Node curr = head;
        Node rev = reverseList(head);
        Node temp = rev;
        while(curr!=null){
            if(curr.data!=temp.data){
               
                return status=false;
     
            }else{
                curr = curr.next;
                temp = temp.next;
            }
            
        }
		return status;

        // initialize a stack data structure.
        
    }

    public static void main(String args[]) {
        // an array containing the data of the linked list.
        int[] data = { 1, 2, 3, 2, 1,1};

        // creating the head pointer
        Node head = null;

        // constructing the linked list from last to first
        for (int i = data.length - 1; i >= 0; i--) {
            head = new Node(data[i], head);
        }


        if (checkPalindrome(head))
            System.out.println("The linked list is a palindrome linked list.");
        else
            System.out.println("The linked list is not a palindrome linked list.");

    }
}