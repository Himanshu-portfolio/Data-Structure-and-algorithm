package linkedList;

public class LinkedListAllOperations {
	
	Node head;
		
		//Insert the data at the start of the linkedlist
		
		public void insertAtStart(int x) {
			if(head==null) {
				head = new Node(x);
			}
			else {
				Node newNode = new Node(x);
				newNode.next = head;
				head = newNode;
			}
			
		}
		
		//Insert the data at the end of the linkedlist
		
		public void insertAtEnd(int x) {
			if(head==null) {
				head = new Node(x);		
			}
			else {
				Node newNode = new Node(x);
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
		}
		
		// Deletion of Linkedlist at start
		
		public void deleteAtStart() {
			if(head==null) {
				System.out.println("Linkedlist is empty");
			}else {
				head = head.next;
			}
			
		}
		
		// Deletion at the end of the LinkedList
		
		public void deletionAtEnd() {
			if (head==null) {
				System.out.println("linked List is empty");				
			} else if(head.next == null) {
				head = null;
			}else {
               Node temp = head;
               while(temp.next.next!=null) {
            	   temp = temp.next;
               }
               temp.next = null;
			}
		}
		
		
		// Reverse of a  Linkedlist
		
		public void reverseLinkedlist() {
			if(head==null) {
				System.out.println("Linked list is empty");
			}else if(head.next == null) {
				System.out.println("only one node is present");
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
			}
		}
		
		// Print the middle of LinkedList
	    public int middleOfLinkedlist(){
	        if(head==null){
	            return 0;
	        }
	        Node fast = head;
	        Node slow = head;
	        while(fast!= null && fast.next!=null ){
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        System.out.println(slow.data);
	        return slow.data;
	        
	    }
	    
	    // Delete the middle of linked List
	    public void deleteMiddleOfLinkedlist() {
	    	   if(head==null || head.next == null){
		            System.out.println("No middle Element");
		        }
	    	    Node prev = null;
		        Node fast = head;
		        Node slow = head;
		        while(fast!= null && fast.next!=null ){
		            fast = fast.next.next;
		            prev = slow;
		            slow = slow.next;
		        }
		        
		        prev.next = slow.next;
		        
		    }
	    
	    // Deletion after the middle of linked list
	    
	    public void deleteAfterMiddleOfLinkedlist() {
	    	   if(head==null || head.next == null){
		            System.out.println("No middle Element");
		        }
		        Node fast = head;
		        Node slow = head;
		        while(fast!= null && fast.next!=null ){
		            fast = fast.next.next;
		            slow = slow.next;
		        }
		        slow.next = slow.next.next;
		        
		    }
	    
	 // Delete the middle of linked List
	    public void deleteBeforeMiddleOfLinkedlist() {
	    	   if(head==null || head.next == null){
		            System.out.println("No middle Element");
		        }
	    	    Node prev = null;
		        Node fast = head.next.next;
		        Node slow = head;
		        while(fast!= null && fast.next!=null ){
		            fast = fast.next.next;
		            prev = slow;
		            slow = slow.next;
		        }
		        
		        prev.next = slow.next;
		        
		    }
	    
	    // Insertion in the after middle of linkedlist
	    public void insertionAfterMiddleOfLinkedlist(int x) {
	    	   if(head==null){
		           head = new Node(x);
		        }
	    	   if(head.next==null) {
	    		   head.next = new Node(x);
	    	   }
	    	   Node newNode = new Node(x);
		        Node fast = head;
		        Node slow = head;
		        while(fast!= null && fast.next!=null ){
		            fast = fast.next.next;
		            slow = slow.next;
		        }
		        Node temp = slow.next;
		        slow.next = newNode;
		        newNode.next = temp;		        
		    }
	    
	    // Insertion in the before middle of linkedlist
	    public void insertionBeforeMiddleOfLinkedlist(int x) {
	    	   if(head==null){
		           head = new Node(x);
		        }
	    	   if(head.next==null) {
	    		   head.next = new Node(x);
	    	   }
	    	   Node newNode = new Node(x);
		        Node fast = head.next.next;
		        Node slow = head;
		        while(fast!= null && fast.next!=null ){
		            fast = fast.next.next;
		            slow = slow.next;
		        }
		        Node temp = slow.next;
		        slow.next = newNode;
		        newNode.next = temp;		        
		    }
	    
	    // insert the new node at the given positon in linkedlist 
	    
	    public void insertionAtGivenPosition(int x, int pos) {
	    	Node newNode = new Node(x);
			if(head == null) {
				head = new Node(x);
			}
		    if(pos == 1) {
				newNode.next = head;
				head = newNode;
		    }
		     int count = 1;
		     Node temp = head;
		     while(count!=pos-1 && temp.next!=null) {
		    	 temp = temp.next;
		    	 count +=1;
		     }
		     Node temp1 = temp.next;
		     temp.next = newNode;
		     newNode.next = temp1;
		}
	    
	    //Insertion in the linkedlist at the given index
	    
	    public void insertionAtGivenIndex(int x, int index) {
	    	Node newNode = new Node(x);
			if(head == null) {
				head = new Node(x);
			}
		    if(index == 1) {
				newNode.next = head;
				head = newNode;
		    }
		     int count = 0;
		     Node temp = head;
		     while(count!=index && temp.next!=null) {
		    	 temp = temp.next;
		    	 count +=1;
		     }
		     Node temp1 = temp.next;
		     temp.next = newNode;
		     newNode.next = temp1;
		}
	    
	    // Remove duplicate array in sorted linkedlist
	    
	    public void removeDuplicateInSortedLinkedlist() {
	    	if(head==null) {
	    		System.out.println("linkedlist is empty");
	    	}
	    	if(head.next == null) {
	    		System.out.println("only one element is present");
	    	}
	    	Node temp = head;
	    	Node current = head.next;
	    	Node prev = head;
	    	while(temp !=null && temp.next!= null) {
	    		if(prev.data!=current.data) {
	    			current = current.next;
	    			prev = prev.next;
	    			temp = temp.next;
	    			
	    		}else {
	    			prev.next = current.next;
	    			current = current.next;
	    			temp = temp.next;
	    		}
	    	}
	    	
			
		}
	    
	    
	    // Rotate the Linkedlist from given postion
	    
	    public void rotateLinkedList(int pos) {
	    	   Node prev = head;
	           Node current = head;
	           for(int i=0; i<pos-1; i++){
	               current = current.next;
	           }
	           Node temp1 = current;
	           Node temp = current.next;
	           if(temp!=null) {
	           while(temp!=null && temp.next!=null){
	               temp=temp.next;
	           } 
	           temp.next = prev;
	           head = current.next;
	           temp1.next = null;
	           }else {
	        	   System.out.println("can't rotate");
	           }
	           
		}
	    
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedListAllOperations linkedList = new LinkedListAllOperations();
       linkedList.insertAtEnd(10);
       linkedList.insertAtEnd(20);
       linkedList.insertAtEnd(30);
       linkedList.insertAtEnd(40);
       linkedList.insertAtEnd(50);
       linkedList.insertAtEnd(60);
       linkedList.insertAtEnd(70);
       System.out.println("Before  ------------------->>>>>");
       PrintLinkedList.printLinkedList(linkedList);
//       linkedList.middleOfLinkedlist();
//       linkedList.deleteBeforeMiddleOfLinkedlist();
//       System.out.println("After -------->"); 
//       linkedList.reverseLinkedlist();
//       PrintLinkedList.printLinkedList(linkedList);
//       System.out.println("Middle of Linked List ----------------------------------->>>>>>>>>>>>>");
//       linkedList.middleOfLinkedlist();
       System.out.println("After ---------------->>>>>>>>>>");
//       linkedList.deleteBeforeMiddleOfLinkedlist();
       linkedList.rotateLinkedList(4);
       PrintLinkedList.printLinkedList(linkedList);
       
       
	}

}

