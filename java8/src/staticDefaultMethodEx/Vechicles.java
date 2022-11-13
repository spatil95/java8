package staticDefaultMethodEx;

public interface Vechicles {

	 void horn();
	 
	 default void speed() {
		 System.out.println("speed is 100");
	 }
	 
	 static void tyre() {
		 System.out.println("TVS Tyre");
	 }
}


//Illegal modifier for the interface method horn; 
//only public, abstract, default, static and strictfp are permitted