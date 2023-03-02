package mapEx;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		//null key/value allow-hashMap,LinkHashMap
		//null key/value not allow - treeMap
		
		//ordered - treeMap(ascending),LinkHashMap(insertion)
		//unordered -hashMap
		
		Map<String,Integer> map1= new HashMap<>();
		map1.put("sagar", 11);
		map1.put(null, 11);
		map1.put(null, 15);
		map1.put("arvind", 25);
		
		System.out.println(map1);
		
		for(Map.Entry<String, Integer> m : map1.entrySet())
		{
			System.out.println("Key:"+m.getKey()+" ; value="+m.getValue());
		}
		
		map1.entrySet().stream().forEach(System.out::println);
		
	}
}
