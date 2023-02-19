package stack;

import java.util.Stack;

public class ValidParanthesis {
    String s = "{}[](}";
    
   public Boolean checkParanthesis() {
		
	   Stack<Character> stack = new Stack<Character>();
	   for (char c:s.toCharArray() ) {
		   if(c == '[' || c == '{' || c == '(') {
			   stack.push(c);
		   }else if(c == ']') {
			   if(stack.isEmpty() || stack.pop()!='[') {
				   return false;
			   }
		   }else if(c == ')') {
			   if(stack.isEmpty() || stack.pop()!='(') {
				   return false;
			   }
		   }else if(c == '}') {
			   if(stack.isEmpty() || stack.pop()!='{') {
				   return false;
			   }
		   }
	   }
	   
	   return true;
	}
   
   	public static void main(String[] args) {
   		ValidParanthesis vp = new ValidParanthesis();
   		System.out.println(vp.checkParanthesis());
   	}
}

