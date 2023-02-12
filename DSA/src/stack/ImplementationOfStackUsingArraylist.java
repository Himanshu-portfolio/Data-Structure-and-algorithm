package stack;

import java.util.ArrayList;

public class ImplementationOfStackUsingArraylist {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void push(int x) {
		al.add(x);
	}
	int pop() {
		int res = -1;
		if(al.isEmpty()) {
			System.out.println("Stack is empty");
		
		}else {
		res = al.get(al.size()-1);
		al.remove(al.size()-1);
		}
		return res;
	}
	int peek() {
		int res = -1;
		if(al.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
		res = al.get(al.size()-1);
		}
		return res;
	}
	int size() {
		return al.size();
	}
	boolean isEmpty() {
		return al.isEmpty();
	}
	 void printStack() {
		int temp = al.size()-1;
		while(temp!=-1) {
			System.out.println("Elements in Stack ------->>>>>>>>>"+ al.get(temp));
			temp--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationOfStackUsingArraylist al = new ImplementationOfStackUsingArraylist();
//		System.out.println(al.size());
//		System.out.println(al.pop());
//		System.out.println(al.peek());
		al.push(10);
		al.push(20);
		al.push(30);
		al.printStack();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.pop());
		System.out.println(al.peek());
		al.printStack();
	}

}
