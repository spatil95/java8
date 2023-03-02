package programs;

import java.util.HashMap;

public class CountOccuranceOfChar2 {
	
	public static void main(String[] args) {
		String name="sagarPatil";
		
		HashMap<Character,Integer> occurences = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			
			if(occurences.containsKey(name.charAt(i))) {
				int count = occurences.get(name.charAt(i));
				occurences.put(name.charAt(i),++count);
			}else {
				occurences.put(name.charAt(i),1);
			}
			
		}
		System.out.println(occurences);
		
		//using java8
		
	}
}
