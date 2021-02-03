package predicate_demo;
import java.util.function.Function;

public class FunctionalChaining {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> doubleIt = i -> 2*i;
		System.out.println("Double Function " + doubleIt.apply(2));
		
		Function<Integer,Integer> cubeIt = i -> i*i*i;
		System.out.println("Cube Function " + cubeIt.apply(2));
		
		System.out.println("First Doubling using apply " + doubleIt.andThen(cubeIt).apply(2));
	
		System.out.println("First Cubing using compose " + doubleIt.compose(cubeIt).apply(2));
				
	}
	

}
