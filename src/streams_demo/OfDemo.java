package streams_demo;

import java.util.stream.Stream;

public class OfDemo {
	
	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,11111).forEach(x -> System.out.println(x));
		
		String[] name = {"Code", "Decode", "Demos"};
		Stream.of(name).filter(x -> x.length() > 4).forEach(x -> System.out.println(x));
	 	
		}
	
	
}
