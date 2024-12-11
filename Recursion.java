package java_collections;

public class Recursion {

	
public static void Morning(int x) {
	if(x<=10) {
 System.out.println("Good Morning;");  
  Morning(x+1);                              // StackOverflowError
}
}
public static void main(String[] args) {
	Morning(1);
}
}
