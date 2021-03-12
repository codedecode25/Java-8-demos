package predicate_demo;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {
	
	public static void main(String[] args) {
//		PredicateFunctionDemo predicateFunctionDemo = new  PredicateFunctionDemo();
//		System.out.println(predicateFunctionDemo.testStringLength("code decode"));
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("The length of string is greater than 5 : " + checkLength.test("code decode"));
		
		Function<Integer , Integer> squareMe = i -> i*i;
		System.out.println("Square of 5 is " + squareMe.apply(5));
	}
	
//	public boolean testStringLength(String s) {
//		if (s.length() >= 5) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	

}
