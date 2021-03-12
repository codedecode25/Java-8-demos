package predicate_demo;
import java.util.function.Predicate;

public class PredicateJoining {
	
	public static void main(String[] args) {
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("The length of string is greater than 5 : " + checkLength.test("code decode"));
		
		Predicate<String> checkEvenLength = s -> s.length() %2 == 0;
		System.out.println("The length of string is : " + checkEvenLength.test("code decode"));
		
		//it can be joined with and
		System.out.println("after merging with and " + checkLength.and(checkEvenLength).test("code decode"));
		
	
		//it can be joined with and
		System.out.println("after merging with or " + checkLength.or(checkEvenLength).test("code decode"));
				
				
		//it can be joined with and
		System.out.println("after merging with negate " + checkLength.negate().test("code decode"));
				
	}
	

}
