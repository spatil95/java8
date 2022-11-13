package inheritanceEx;

public class ChildClass extends ParentClass {
	// the same method also exists in the ParentClass
	// it does not override, actually it is method hiding
	public static void display() {
		System.out.println("Overridden static method in Child Class in Java");
	}
}
