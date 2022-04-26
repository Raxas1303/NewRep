package cycles;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pair = 1;

		while (pair < 11) {
			pair++;

			System.out.println("Введите два числа:");
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			if (n > m) {
				System.out.println(n);
			} else if (m > n) {
				System.out.println(m);
			} else if (m == n) {
				System.out.println(m + "=" + n);
			}
		}
		scanner.close();
	}
}
