package comparableAndComparatorEx;

import java.util.Comparator;

public class FeesComparatorEx implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getFees()==o2.getFees())
		{
			return 0;
		}else if(o1.getFees()>o2.getFees())
		{
			return 1;
		}else {
			return -1;
		}
	}

	
}
