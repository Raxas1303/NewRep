package cycles;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел:");
		int n = scanner.nextInt();
		int b = 0;
		int c = 0;
		int d = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Введите " + i + " число:");
			int a = scanner.nextInt();
			if (a > 0) {
				b++;
			} else if (a < 0) {
				c++;
			} else if (a == 0) {
				d++;
			}
		}
		System.out.println("Количество отрицательных: " + c);
		System.out.println("Количество положительных: " + b);
		System.out.println("Количество нулей: " + d);
		scanner.close();
	}
}
