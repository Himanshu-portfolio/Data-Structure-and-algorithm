package stack;

import java.util.ArrayList;

public class GetMinProblem {
	ArrayList<Integer> stack = new ArrayList<Integer>();
	ArrayList<Integer> minStack = new ArrayList<Integer>();
	int minValue =-1;
	
	int push(int x) {
		if(stack.isEmpty() && minStack.isEmpty()) {
			stack.add(x);
			minStack.add(x);
			minValue =  minStack.get(minStack.size()-1);
			}
		else if(x<=minStack.get(minStack.size()-1)) {
				stack.add(x);
				minStack.add(x);
				minValue =  minStack.get(minStack.size()-1);
			}
			else {
				stack.add(x);
				minValue =  minStack.get(minStack.size()-1);
			}
			return minValue;
		}
	int pop() {
		
		if(stack.isEmpty() && minStack.isEmpty()) {
			return -1;
		}
		if(stack.get(stack.size()-1) == minStack.get(minStack.size()-1)) {
			
			stack.remove(stack.size()-1);
			minStack.remove(minStack.size()-1);
			minValue =  minStack.get(minStack.size()-1);
		}else {
			stack.remove(stack.size()-1);
			minValue =  minStack.get(minStack.size()-1);
		}
		return minValue;
	}
	void printStack() {
		int temp = stack.size()-1;
		while(temp!=-1) {
			System.out.println("Elements in Stack ------->>>>>>>>>"+ stack.get(temp));
			temp--;
		}
	}
	void printminStack() {
		int temp = minStack.size()-1;
		while(temp!=-1) {
			System.out.println("Elements in minStack ------->>>>>>>>>"+ minStack.get(temp));
			temp--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GetMinProblem stack = new GetMinProblem();
       System.out.println(stack.push(10));
       System.out.println(stack.push(20));
       System.out.println(stack.push(9));
       System.out.println(stack.pop());
       stack.printminStack();
       stack.printStack();
	}

}
