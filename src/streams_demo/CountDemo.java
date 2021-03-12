package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
		
		//get Stream object
		Stream<Integer> openStream = arList.stream();
		//Configure stream by filtering out required values
		Stream<Integer> fileterdStream = openStream.filter(i -> i >= 20);
		long streamCount  = fileterdStream.count();
		System.out.println(streamCount);
		
		System.out.println("Now in single line");
		
		long newFileterdListCount = arList.stream().count();
		System.out.println(newFileterdListCount);
	}
	
	
}
