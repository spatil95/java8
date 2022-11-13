package staticDefaultMethodEx;

public interface Interface1 {
	
	void demo1();

	 static void demo2() {
		System.out.println("default demo2 method called...");
	}
}
