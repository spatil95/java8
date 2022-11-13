package methodReference;

public class Main {
	
	public static void main(String[] args) {
		
		Sayable sayable = StaticMethodReference::saySomething;
		sayable.say();
		
		
		InstanceMethodReference i = new InstanceMethodReference();
		Sayable sayable1 = i::instanceMethodReference;
		sayable1.say();
	}

}
