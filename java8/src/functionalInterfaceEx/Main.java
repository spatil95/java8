package functionalInterfaceEx;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main{

	//method run() is a functional interface
	public static void main(String[] args) {
		
		System.out.println(Interface1.data1);
		//demo1
		Interface1 i1 = (num1,num2)->{
			return num1+num2;
		};
		int total = i1.add(10, 20);
		System.out.println(total);
		
		
		
		//demo2 using lambda override functional interface
		Thread t = new Thread(()->{
			System.out.println("run method called...");
		});
		t.start();
		
		
		
		
		//demo 3 using anonymous class override functional interface
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t1 run method called...");
			}
		});
		t1.start();
		
		
		
		//Java SE 8 included four main kinds of functional interfaces
		
		//
		
		//example
		
	
		
		//1.Predicate ((int||float||double||long) p1)   //bi-predicate (p1,p2)  //its return boolean value in both
		Predicate<Integer> pi=(p1)->{return (p1>20);}; //return keyword not neccessory 
		System.out.println(pi.test(50));
		BiPredicate<Integer,Integer> bpi=(p1,p2)->(p1<p2);
		System.out.println(bpi.test(50,20));
		
		//2.Consumer ((int||float||double||long) p1)   //bi-consumer (p1,p2)  //no return in both
		Consumer<Integer> c=(p1)->{System.out.println("Consumer single paramter method called::value "+p1);};
		c.accept(10);
		BiConsumer<Integer,Integer> bc=(p1,p2)->{System.out.println("Consumer single paramter method called::value "+(p1+p2));};
		bc.accept(10,20);
		
		//3.Function ((int||float||double||long) p1)   //bi-Function (p1,p2)  //its return result like second generic result
		Function<Integer,String> fi=(p1)->{return "The value is :"+p1;};
		System.out.println(fi.apply(10));
		
		BiFunction<Integer,Integer,String> bfi=(p1,p2)->{return "The value is :"+(p1+p2);};
		System.out.println(bfi.apply(10,12));
		
		//4 Supplier () no paramter but return value
		Supplier<String> si=()->{return "My name is SAGAR";};
		System.out.println(si.get());
		
		
	}

	
}
