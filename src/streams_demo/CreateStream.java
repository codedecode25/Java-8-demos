package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	
	public static void main(String[] args) {
		List<Integer> arList =new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(5);
		
		Stream s = arList.stream();
		
	}

}
