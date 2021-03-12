
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	void singleAbstMethod();
	
//	void singleAbstMethod2();
	
	default void printName()
    {
        System.out.println("Welcome to Code Decode");
    }
	

}



