
final class ImmutableEx {

	  // private class members
	 final private String name;
	 final private int date;

	  ImmutableEx(String name, int date) {

	    // class members are initialized using constructor
	    this.name = name;
	    this.date = date;
	  }

	  // getter method returns the copy of class members
	  public String getName() {
	    return name;
	  }

	  public int getDate() {
	    return date;
	  }

	}

	class Main {
	  public static void main(String[] args) {

	    // create object of Immutable
		  ImmutableEx obj = new ImmutableEx("Programiz", 2011);


	    System.out.println("Name: " + obj.getName()+"::"+"Date: " + obj.getDate());
	  }
}
