import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Main1  {
	
	//Write Program to Count the char in word of "java_programming_language"

	 //{_=2, a=5, e=1, g=4, i=1, j=1, l=1, m=2, n=2, o=1, p=1, r=2, u=1, v=1}

		/*
		 * public static void main(String[] args) { String str=
		 * "java_programming_language";
		 * 
		 * 
		 * Map<Character,Integer> map= new HashMap<>();
		 * 
		 * char ch[]=str.toCharArray(); for(int i=0;i<ch.length;i++){
		 * 
		 * System.out.println("Test::"+map.containsKey(ch[i]));
		 * 
		 * if(map.containsKey(ch[i])) { Integer no = map.get(ch[i]); map.put(ch[i],
		 * ++no); }else { map.put(ch[i], 1); }
		 * 
		 * } System.out.println(map);
		 * 
		 * }
		 */
	
	public void m1(String s) {
        System.out.println("String arg");
    }

 

    public void m1(Object o) {
        System.out.println("Object arg");
    }

 

    public static void main(String[] arg) {
    	
    	Predicate<String> result= (str)-> 1==2;
    	System.out.println(result.test("Test"));
    	
    }
}
