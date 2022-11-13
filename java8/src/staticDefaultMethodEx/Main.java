package staticDefaultMethodEx;

public class Main {
	
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.horn();
		bike.speed();
		
		Car car = new Car();
		car.horn();
		car.speed();
		
		
		//Vechicles.tyre();
		
		//annonymouse classes
		/*
		 * Vechicles v = new Vechicles() {
		 * 
		 * @Override public void horn() { System.out.println("Horn called..."); } };
		 * v.horn(); v.speed();
		 */
		
		//lambda expression
		Vechicles v =()->{
			System.out.println("Horn called...lambda");
		};
		v.horn(); v.speed(); Vechicles.tyre();
		}	
}       