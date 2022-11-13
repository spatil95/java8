package comparableAndComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("sagar", 101, "Thane", 15000));
		student.add(new Student("rutuja", 102, "Panvel", 8000));
		student.add(new Student("Arvind", 103, "Thane", 17000));
		student.add(new Student("Dipali", 104, "Chembur Nala", 2200));
		
		
		//Comparable example
		//Collections.sort(student);	
		
		//Comparator Example
		//Collections.sort(student, new FeesComparatorEx());
		
		//Anonymous 
//		Comparator<Student> s = new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
//		Collections.sort(student,s);
		
		
		//comparator using lambda 
		Collections.sort(student,(o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		
		student.forEach(s1->System.out.println(s1));
	}
}
