package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(250);
		arList.add(52);
		
		
		//get Stream object
		Stream<Integer> openStream = arList.stream();
		//Configure stream by filtering out required values
		Stream<Integer> fileterdStream = openStream.filter(i -> i >= 20);
		//u can sort on any stream filter or mapped or on normal stream (non filter or non mapped too)
		Stream<Integer> sortedStream  = fileterdStream.sorted();
		sortedStream.forEach(x -> System.out.println(x));
		
		System.out.println("Now in single line");
		
		Stream<Integer> newFileterdSortedList = arList.stream().sorted();
		newFileterdSortedList.forEach(x -> System.out.println(x));
	}
	
	
}
