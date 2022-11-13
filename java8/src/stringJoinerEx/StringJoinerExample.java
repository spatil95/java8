package stringJoinerEx;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {  
        
		//add(),merge(),length(),setEmptyValue()  methods in StringJoiner
		
		//demo 1
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter     
		joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");   
        System.out.println(joinNames);
        
        //demo 2
        StringJoiner joinNames1 = new StringJoiner(",","[","]"); // passing comma(,) as delimiter     
		joinNames1.add("1");  
        joinNames1.add("2");  
        joinNames1.add("3");  
        joinNames1.add("4");   
        System.out.println(joinNames1);
        System.out.println(joinNames1.length());

        
        //demo3 merge method
        StringJoiner merge= joinNames1.merge(joinNames);
        System.out.println(merge);
        
    }  
}
