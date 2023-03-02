package streamApiEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S1 {

	public static void main(String[] args) {

		/*
		 * Integer data[]= {1,2,3,4,5,6,7};
		 * 
		 * int data1[]= {1,2,3,4,5,6};
		 */
		
		
		List<Integer> li = new ArrayList<>();

		li.add(4);
		li.add(5);
		li.add(8);
		li.add(5);
		li.add(7);
		li.add(4);
		li.add(5);

		List li1 = li.stream().distinct().collect(Collectors.toList());
		System.out.println(li1);
		
		System.out.println(li.stream().filter(m->m%2 == 0).mapToInt(m->m.intValue()).sum());
		

	}
}
