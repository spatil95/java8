package collectionEx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import LambdaEx.Product;

public class Main extends Hello{
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ArrayList//insertion Order //allowed null//contain duplicates
		List l = new LinkedList<>();
		l.add("sagar");
		l.add("aaa");
		l.add("mask");
		l.add("vishal");
		l.add("zzz");
		l.add(null);
		
		System.out.println("::Contains::"+l.contains("sagar"));
		
		
		List l1= (List) l.stream().filter(l2->l2!=null && ((String) l2).contains("s")).map(l2->l2).collect(Collectors.toList());
		System.out.println(l1);
		
		Long count=  l.stream().filter(l2->l2!=null && ((String) l2).contains("s")).count();
		System.out.println(count);
		
		l.stream().forEach(p->System.out.println(p));
		
		/*
		 * Iterator<Object> it = l.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
		  List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f)); 
	        productsList.add(new Product(7,"ss ss",2800f));  

	        // Using Collectors's method to sum the prices.  
	        Double totalPrice3 =  productsList.stream().collect(Collectors.summingDouble(p->p.getPrice())) ;
	        System.out.println(totalPrice3);  
	        
	        Product  maxAmount=productsList.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
	        System.out.println(maxAmount);
	        
		
	}
}
