package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArrayDemo {
	
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
		Object[] intArr  = fileterdStream.toArray();
		for(Object o : intArr) {
			System.out.println("element in array is " + o);
		}
		
		System.out.println("Now in single line");
		
		Object[] intArrOneLiner = arList.stream().filter(i -> i >= 20).toArray();
		for(Object o : intArrOneLiner) {
			System.out.println("element in array is " + o);
		}
	}
	
	
}
