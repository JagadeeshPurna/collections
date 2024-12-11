package java_collections;
import java.util.Stack;
public class Stack_push_pop_exp {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		boolean result=stk.empty();
		System.out.println("Is stack empty:"+ result);
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		System.out.println(stk);
		result=stk.empty();
		System.out.println("Is stack empty:"+result);

	}

}
