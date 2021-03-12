
public class InterfaceDemoImpl3WithOverridenDefault implements InterfaceDemo {
	
	public void printName()
    {
        System.out.println("Welcome to overriden method by Code Decode");
    }
	
	public static void main(String[] args) {
		InterfaceDemoImpl3WithOverridenDefault default1 = new InterfaceDemoImpl3WithOverridenDefault();
		default1.printName();
	}
	
	
}
