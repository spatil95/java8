package LambdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import staticDefaultMethodEx.Vechicles;

public class Main {

	public static void main(String[] args) {

		Vechicles v = new Vechicles() {

			@Override
			public void horn() { // TODO Auto-generated method stub
				System.out.println("Horn called.....(annonymous class)");
			}
		};
		v.horn();
		

		Vechicles v1 = () -> {
			System.out.println("Horn called.....(Lambda)");
		};
		v1.horn();
		v1.speed();
		
		System.out.println("_________________Foreach Loop____________________________");
		List<String> list=new ArrayList<String>();  
        list.add("Dipali");  
        list.add("Rutuja");  
        list.add("Arvind");  
        list.add("Sagar");
        
        list.forEach(l->{System.out.println(l);});
        
		System.out.println("_________________Thread____________________________");
		Runnable r = ()->{ System.out.println("Running....");};
		Thread s = new Thread(r);
		s.start();
		
		System.out.println("_________________Comparator____________________________");
        List<Product> plist=new ArrayList<Product>();   
        plist.add(new Product(1,"HP Laptop",25000f));  
        plist.add(new Product(3,"Keyboard",300f));  
        plist.add(new Product(2,"Dell Mouse",150f));
        
        Collections.sort(plist,(p1,p2)->{
        	return p1.name.compareTo(p2.name);
        });
        
        Collections.sort(plist,(p1,p2)->{
        	return (int) (p1.price - p2.price);
        });
        
        plist.forEach((p)->{System.out.println(p);});
	}

}
