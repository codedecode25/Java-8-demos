import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		 String[] str = new String[4];  
//	     int lengthOfString = str[5].length();  
//	        System.out.print(lengthOfString);  
//		 String[]  str = {"Hi", "Welcome", "To", "CodeDecode"};
	        
	        Optional<String> checkNull = Optional.ofNullable(str[3]);  
	        if(checkNull.isPresent()){  // check for value is present or not  
	        	int lengthOfString = str[3].length();  
		        System.out.print(lengthOfString); 
	        }else  
	            System.out.println("string value is not present");  
	    }  

}
