package streamApiEx;

public class Product {
	  int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Product [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append(", price=");
			builder.append(price);
			builder.append("]");
			return builder.toString();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}  
	    
	    
}
