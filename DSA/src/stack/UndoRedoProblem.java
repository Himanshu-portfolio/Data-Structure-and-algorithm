package stack;

import java.util.ArrayList;

public class UndoRedoProblem {
	
	ArrayList<String> undoStack = new ArrayList<String>();
	
   void undo(ArrayList<String> list){
		if(list.size()==0) {
			System.out.println("stack is empty");
		}else {
			String res = list.get(list.size()-1);
			undoStack.add(res);
			list.remove(list.size()-1);
		}
		
	}
   void redo(ArrayList<String> list) {
	   if(undoStack.size()==0) {
			System.out.println("stack is empty");
		}
	   else {
		   String res = undoStack.get(undoStack.size()-1);
		   list.add(res);
		   undoStack.remove(undoStack.size()-1);
	   }
   }
   void printStack(ArrayList<String> list) {
		int temp = list.size()-1;
		while(temp!=-1) {
			System.out.println("Elements in Stack ------->>>>>>>>>"+ list.get(temp));
			temp--;
		}
	}
   void printStack() {
		int temp = undoStack.size()-1;
		while(temp!=-1) {
			System.out.println("Elements in undoStack ------->>>>>>>>>"+ undoStack.get(temp));
			temp--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		UndoRedoProblem stack = new UndoRedoProblem();
		al.add("Hi");
		al.add("I");
		al.add("am");
		al.add("jain");
//		stack.printStack(al);
		stack.undo(al);
		stack.printStack(al);
		stack.printStack();
		al.add("Himanshu");
		stack.redo(al);
		stack.printStack(al);
		stack.printStack();
		
		
	}

}
