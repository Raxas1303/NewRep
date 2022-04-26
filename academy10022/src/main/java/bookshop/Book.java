package bookshop;

public class Book implements Printable {

	@Override
	public void print() {
		System.out.println("Книга");
	}

	public static void printBooks(Printable[] printable) {
		for (Printable printable2 : printable) {
			if (printable2 instanceof Book) {
				printable2.print();
			}
		}
	}
}
