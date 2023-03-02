import java.util.HashSet;

public final class Student {

	private final int id;
	private final String name;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int hashCode() {
		return this.id;
	}

	public String toString() {
		return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
	}

	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return s.id == this.id ? true : false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		HashSet<Student> studentList = new HashSet<>();
		Student st1 = new Student("Nimit", 1);
		Student st2 = new Student("Rahul", 1);
		Student st3 = new Student("Nimit", 2);
		
		System.out.println(st1.hashCode()+""+st2.hashCode()+""+st3.hashCode());
		
		
		System.out.println(studentList.add(st1));
		System.out.println(studentList.add(st2));
		System.out.println(studentList.add(st3));
		System.out.println(studentList.size());
		
		System.out.println(studentList.size());
		System.out.println(studentList);
	}
}

