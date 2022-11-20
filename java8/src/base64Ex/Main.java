package base64Ex;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Main {
	public static void main(String[] args) {
		
		//Java Base64 Example: URL Encoding and Decoding
		 Encoder encoder = Base64.getUrlEncoder(); 
		 // Encoding URL  
	     String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
	     System.out.println("Encoded URL: "+eStr);  
	     
		 Decoder decoder = Base64.getUrlDecoder(); 
		 System.out.println(new String(decoder.decode(eStr)));
		 
		 System.out.println("_____________________________________________");
		 
		 // Getting MIME encoder  
	        Base64.Encoder encoder1 = Base64.getMimeEncoder();  
	        String message = "Hello, \nYou are informed regarding your inconsistency of work";  
	        String eStr1 = encoder1.encodeToString(message.getBytes());  
	        System.out.println("Encoded MIME message: "+eStr1);  
	          
	        // Getting MIME decoder  
	        Base64.Decoder decoder1 = Base64.getMimeDecoder();  
	        // Decoding MIME encoded message  
	        String dStr2 = new String(decoder1.decode(eStr1));  
	        System.out.println("Decoded message: "+dStr2);  
	}
}
