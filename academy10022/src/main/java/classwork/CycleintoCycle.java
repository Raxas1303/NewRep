package classwork;

public class CycleintoCycle {
	public static void main(String[] args) {
		Outer: for (int i = 0; i < 10; i++) {
			System.out.println("Проход" + i + ":");
			Inner: for (int j = 0; j < 56; j++) {
				if (i * j == 56) {
					System.out.println("i будет равно: " + i + " и " + " j будет равно " + j);
					break Outer;
				}

			}
		}
	}
}
