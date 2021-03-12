
public class TestFIDemo {
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo f = () -> System.out.println("IMPLEMENTATION of SAM");
		f.singleAbstMethod();
	}
	
	
	
}
