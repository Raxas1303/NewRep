package homework3;

public class Chocolate extends Product {

	private String color;

	public Chocolate() {
		super();
	}

	public Chocolate(double price, int quantity, String name, String color) {
		super(price, quantity, name);
		this.color = color;
	}

	@Override
	public double getDiscount() {
		if (getQuantity() >= 3) {
			return 0.8;
		}
		return 1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chocolate [price=");
		builder.append(getPrice());
		builder.append(", quantity=");
		builder.append(getQuantity());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}