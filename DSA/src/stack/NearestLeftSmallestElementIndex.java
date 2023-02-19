package stack;

import java.util.Stack;

public class NearestLeftSmallestElementIndex {
	int arr[] = new int[] {4,2,5,10,12,13,1};
	int ans[] = new int [7];

	Stack<Integer> stack = new Stack<Integer>();

	public void nearLeftElement() {
		for (int i = 0; i < arr.length; i++) {
			while(stack.isEmpty() != true && arr[i]<= arr[stack.peek()]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}
			stack.push(i);
		}
	}
	public void printAns() {
		for (int element: ans) {
	        System.out.println(element);
	    }
	}
	public static void main(String[] args) {
		NearestLeftSmallestElementIndex nlfs = new NearestLeftSmallestElementIndex();
		nlfs.nearLeftElement();
		nlfs.printAns();
	}
}
