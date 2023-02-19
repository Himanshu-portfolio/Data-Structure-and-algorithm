package stack;

import java.util.Stack;

public class MaximumCommonSum {
int arr1[] = new int [] {0,0,1};
int arr2[] = new int [] {1,1,2};
int arr3[] = new int [] {2,0};



Stack <Integer> stack1= new Stack<Integer>();
Stack <Integer> stack2= new Stack<Integer>();
Stack <Integer> stack3= new Stack<Integer>();


public int maxCommonSum() {
	int sum = 0;
	int sum1 = 0;
	int sum2 =0; 
	  for (int i = 0; i < arr1.length; i++) {  
          sum = sum + arr1[i];
          stack1.push(sum);
       } 
	  for (int i = 0; i < arr2.length; i++) {  
          sum1 = sum1 + arr2[i];
          stack2.push(sum1);
       } 
	  for (int i = 0; i < arr3.length; i++) {  
          sum2 = sum2 + arr3[i];
          stack3.push(sum2);
       }
	  while (true) {
		  if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
			  return -1;
		  }
	  else if(stack1.peek()>=stack2.peek() && stack1.peek()>stack3.peek()) {
			  stack1.pop();
		  }
		  else if(stack2.peek()>stack1.peek() && stack2.peek()>=stack3.peek()) {
			  stack2.pop();
		  }
		  else if(stack3.peek()>stack1.peek() && stack3.peek()>=stack1.peek()) {
			  stack3.pop();
		  }
		  else if(stack1.peek() == stack2.peek() && stack1.peek() == stack3.peek()) {
			  return stack1.peek();
		  }else {
			  return -1;
		  }
	}
}
public static void main(String[] args) {
	MaximumCommonSum mcs = new MaximumCommonSum();
	System.out.println(mcs.maxCommonSum());
}
}


