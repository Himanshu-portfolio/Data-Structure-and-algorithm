package stack;

import java.lang.reflect.Array;
import java.util.Stack;

public class NearestGreaterElementRight {
	int arr[] = new int[] {1,3,2,4};
	int ans[] = new int [4];
    int n = arr.length;
	Stack<Integer> stack = new Stack<Integer>();

	public void nearLeftElement() {
		for (int i = n-1; i >= 0; i--) {
			while(stack.isEmpty() != true && arr[i]>= stack.peek()) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
	}
	public void printAns() {
		for (int element: ans) {
	        System.out.println(element);
	    }
	}
	public static void main(String[] args) {
		NearestGreaterElementRight nger = new NearestGreaterElementRight();
		nger.nearLeftElement();
		nger.printAns();
	}
	

}
