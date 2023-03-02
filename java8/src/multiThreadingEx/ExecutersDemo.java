package multiThreadingEx;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutersDemo implements Callable<Integer>/* ,Runnable */ {

	private int num;

	ExecutersDemo(int num) {
		this.num = num;
	}

	/*
	 * @Override public void run() { System.out.println("Thread number" + num +
	 * "started..."); for (int i = 0; i <= 500; i++) { System.out.print("i" + i); }
	 * System.out.println("Thread number" + num + "stoped..."); }
	 */

	
	  @Override public Integer call() {
	  
	  return 150;
	  
	  }
	 
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		/*
		 * ExecutorService exs= Executors.newSingleThreadExecutor(); exs.execute(new
		 * ExecutersDemo(1)); exs.execute(new ExecutersDemo(2)); exs.execute(new
		 * ExecutersDemo(3)); exs.execute(new ExecutersDemo(4));
		 * System.out.println("Sagar"); exs.shutdown();
		 */

		ExecutorService exs1 = Executors.newFixedThreadPool(2);
		java.util.concurrent.Future<Integer> result = (Future<Integer>) exs1.submit(new ExecutersDemo(1));
		System.out.println(result.get());
	}
}
