package classwork;

public class Sour extends Milk {
	String useable;
	String color;
	String fat;

	public Sour() {
		super();
		color = "white";
		fat = "26";
		useable = "Срок годности не истек";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sour [useable=");
		builder.append(useable);
		builder.append(", color=");
		builder.append(color);
		builder.append(", fat=");
		builder.append(fat);
		builder.append("]");
		return builder.toString();
	}

}
