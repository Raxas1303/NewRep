package homework3;

public class Shop {

	public static void main(String[] args) {

		User buyer = new User(20, "Alex", 100);
		User seller = new User(21, "George", 10);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "Milk", "1");
		Product chocolate = new Chocolate(2, 1, "Chocolate", "1");
		Product cheese = new Cheese(5, 2, "Cheese", "1");
		Product butter = new Butter(3, 1, "Butter", "1");

		Deal deal = new Deal("13/05/2022", "Minsk", buyer, seller, products);

		deal.addProduct(milk);
		deal.addProduct(chocolate);
		deal.addProduct(cheese);
		deal.addProduct(butter);
		System.out.println(deal);

		deal.removeProduct(1);
		System.out.println(deal);

		deal.deal();

	}
}