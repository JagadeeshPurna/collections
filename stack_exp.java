package java_collections;


import java.util.Stack;
public class stack_exp {
	public static void main(String[] args) {
		// creating an instance of stack class
		Stack<Integer> stk = new Stack<>();
		 boolean result = stk.isEmpty();
		 System.out.println("Is stack empty :"+ result);
		 
		 // Pushing elements into Stack
		 stk.push(10);
		 stk.push(20);
		 stk.push(30);
		 stk.push(40);
		 // Print elements of the stack
		 System.out.println("Elements in the stack"+ stk);
		 result=stk.empty();
		 System.out.println("Is elements in Stack empty:"+ result);
	}

}
