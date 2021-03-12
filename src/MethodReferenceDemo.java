
public class MethodReferenceDemo {
	public static void main(String[] args) {
		FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplementation;
		functionalInterfaceDemo.singleAbstMethod();
		
		//If no testImplementation is available in existing code base then use following
//		code for lambda expressions:
//		FunctionalInterfaceDemo f = () -> System.out.println("IMPLEMENTATION of SAM");
//		f.singleAbstMethod();
	}
	 

}

class Test {
	public static void  testImplementation() {
		System.out.println("This is test implementation of your abstract method");
	}
}

