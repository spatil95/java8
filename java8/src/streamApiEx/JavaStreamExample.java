package streamApiEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));

		List<Product> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
																							// //predicate
				.map(p -> p) // fetching price //function
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);

		Map<String, Float> map = new HashMap<>();
		map = productsList.stream().collect(Collectors.toMap(Product::getName, Product::getPrice, (oldValue, newValue) -> oldValue));

		System.out.println(map);

	}
}
