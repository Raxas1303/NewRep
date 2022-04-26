package bookshop;

public class Bookshop {
	public static void main(String[] args) {
		Printable[] array = new Printable[4];
		array[0] = new Book();
		array[1] = new Magazine();
		array[2] = new Book();
		array[3] = new Magazine();
//for (int i = 0; i < array.length; i++) {
//	array[i].print();
		System.out.println("meow");
		Magazine.printMagazines(array);
		Book.printBooks(array);
	}
}
//}
