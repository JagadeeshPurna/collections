package java_collections;


// Write a recursive function to find the factorial of a given number


public class Recursive_exp {

	public static int factorial(int x){
		if (x==1)
			return 1;
		else
			return x*factorial(x-1);
	}
	public static void main(String[] args) {
		
  int f = factorial(5);
  System.out.println("Factorial value ="+ f);
	}

}
