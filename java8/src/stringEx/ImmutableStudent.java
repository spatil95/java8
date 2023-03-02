package stringEx;

public final class ImmutableStudent {

	 	private final int id;
	    private final String name;

	    public ImmutableStudent(int id, String name) {
	        this.name = name;
	        this.id = id;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ImmutableStudent [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append("]");
			return builder.toString();
		}
	    
	    
}
