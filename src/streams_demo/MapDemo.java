package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
//		Stream s = arList.stream().map(i -> i*i);
//		s.forEach(x -> System.out.println(x));	
//		
		arList.stream().map(i -> i*i).forEach(x -> System.out.println(x));
		
	}
	
	
}
