package classwork;

public class Milk extends Product {
	String useable;
	String color;
	String fat;

	public Milk() {
		super();
		color = "white";
		fat = "3.8";
		useable = "Срок годности не истек";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Milk [useable=");
		builder.append(useable);
		builder.append(", color=");
		builder.append(color);
		builder.append(", fat=");
		builder.append(fat);
		builder.append("]");
		return builder.toString();
	}

}
