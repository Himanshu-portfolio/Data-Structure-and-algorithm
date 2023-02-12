package stack;

public class ImplementationOfStackUsingArray {
	
	int arr[];
	int capacity;
	int top;

	
	public ImplementationOfStackUsingArray(int c) {
	    capacity = c;
	    arr = new int[capacity];
	    top = -1;
	}
	void push(int x) {
		top++;
		arr[top] = x;
	}
	int pop() {
		int res = arr[top];
		top--;
		return res;
	}
	int peek() {
		return arr[top];
	}
	int size() {
		return top+1;
	}
	boolean isEmpty(){

		return (top == -1);	
	}
	void printStack() {
		int temp = top;
		while(temp!=-1) {
			System.out.println("Elements in Stack ------->>>>>>>>>"+ arr[temp]);
			temp--;
		}
	}
	
	public static void main(String[] args) {
		
		ImplementationOfStackUsingArray stack = new ImplementationOfStackUsingArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		System.out.println("top element of stack --------> "+stack.peek());
		System.out.println("popped element of stack ------> "+ stack.pop());
		stack.printStack();
		System.out.println("size of array -------->>>>>> "+ stack.size());
	}

}
