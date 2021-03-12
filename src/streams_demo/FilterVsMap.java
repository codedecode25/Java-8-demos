package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterVsMap {

	public static void main(String[] args) {
		
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(5);
		
//		After Filtering number of objects are reduced from 3 to 2
		Stream s = arList.stream().filter(x -> x >= 15);
		s.forEach(x -> System.out.println(x));
		
		
	}
}
