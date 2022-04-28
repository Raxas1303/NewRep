package bookshop;

public class Magazine implements Printable {

	public void print() {
		System.out.println("Журнал");
	}

	public static void printMagazines(Printable[] printable) {
		for (Printable printable2 : printable) {
			if (printable2 instanceof Magazine) {
printable2.print();
			}
		}
	}
}
