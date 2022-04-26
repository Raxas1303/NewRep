package classwork;

public class Product {

	int quantity;
	double cost;
	String name;

	public Product() {
		System.out.println("Конструирование продукта");
		quantity = 10;
		cost = 100;
		name = "baton";
	}

	Product(int quantity, double cost, String name) {
		this.quantity = quantity;
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [quantity=");
		builder.append(quantity);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
