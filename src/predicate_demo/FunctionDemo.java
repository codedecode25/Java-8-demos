package predicate_demo;
import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
//		FunctionDemo functionDemo = new  FunctionDemo();
//		System.out.println(functionDemo.squreInt(5));
		
		Function<Integer , Integer> squareMe = i -> i*i;
		System.out.println("Square of 5 is " + squareMe.apply(5));
	}

	
//	public int squreInt(int i) {
//		int squred = i*i;
//		return squred;
//	}
	

}
