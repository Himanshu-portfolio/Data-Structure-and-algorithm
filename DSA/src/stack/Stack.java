package stack;
 class Node{
	int data;
	Node next;
	public Node(int x){
		data = x;
		next = null;
	}
}
public class Stack {
	Node head = null;

	int size = 0;

public void pushStack(int x) {
	if(size == 0) {
		head = new Node(x);
		size +=1;
	}else {
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
		size +=1;
	}
}

public void popStack() {
	if(size == 0) {
     System.out.println("Stack is empty");
	}else if(size == 1){
		int temp = head.data;
		System.out.println("Popped element of stack " + temp);
		head = null;
		size -=1;
	}else {
		int temp = head.data;
		System.out.println("Popped element of stack " + temp);
		head = head.next;
		size -=1;
	}
}

public void peekStack() {
	if(size == 0) {
		System.out.println("Stack is empty");
	}else {
		System.out.println("peek element of stack" + head.data);
	}
}

public void isStackEmpty() {
	if(size == 0) {
		System.out.println("stack is empty");
	}else {
		System.out.println("Stack is not empty");
	}
}

public void printStack() {
	if(size == 0) {
		System.out.println("Stack is empty");
	}else {
		Node temp = head;
		while(temp.next!=null) {
			System.out.println("Stack Elements -------------->>>" + temp.data);
		}
	}
}
public void stackSize() {

	System.out.println(" size of stack --------------> " + size);
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.pushStack(10);
		stack.pushStack(20);
		stack.pushStack(30);
		stack.printStack();
		stack.stackSize();
	}

}
