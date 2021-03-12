package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
		
		//get Stream object
		Stream<Integer> openStream = arList.stream();
		//Configure stream by filtering out required values
		Stream<Integer> fileterdStream = openStream.filter(i -> i >= 20);
		List<Integer> newFileterdListOrigin  = fileterdStream.collect(Collectors.toList());
		newFileterdListOrigin.stream().forEach(x -> System.out.println(x));
		
		System.out.println("Now in single line");
		
				// What we have done : 
				// 1) Open stream with .stream() 
				// 2) use lambda expression in filter to filter out required objects from the open stream.
				// 3) Collect all filtered elements and add them to a new list called newFileterdList
				
		
		List<Integer> newFileterdList = arList.stream().filter(i -> i >= 20).collect(Collectors.toList());
		newFileterdList.forEach(x -> System.out.println(x));
	}
	
	
}
