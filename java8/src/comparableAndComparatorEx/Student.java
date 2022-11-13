package comparableAndComparatorEx;

public class Student  implements Comparable<Student>{

	String name;
	int sId;
	String address;
	long fees;
	

	public Student(String name, int sId, String address, long fees) {
	
		this.name = name;
		this.sId = sId;
		this.address = address;
		this.fees = fees;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", sId=");
		builder.append(sId);
		builder.append(", address=");
		builder.append(address);
		builder.append(", fees=");
		builder.append(fees);
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.fees==s.getFees())
//		{
//			return 0;
//		}else if(this.fees>s.getFees())
//		{
//			return 1;
//		}else {
//			return -1;
//		}
//	}
	
	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.getName());
	}
	
	
	
}
