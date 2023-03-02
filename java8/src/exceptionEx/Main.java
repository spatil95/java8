package exceptionEx;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		
		 try  
	        {  
			 int data=50/0; //may throw exception   
	        }  
	        //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }
		 	catch(Exception e)  
	        {  
	            System.out.println(e);  
	        }
	        
		 System.out.println("rest of the code");        
	}
	
	public void m()
	{
		n();
	}
	
	public void n()
	{
		
	}
}
