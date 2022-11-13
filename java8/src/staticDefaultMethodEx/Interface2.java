package staticDefaultMethodEx;

public interface Interface2 {
	String functionalM(String data);
	
	default void concrete() {
		System.out.println("concrete called....");
	}
}
