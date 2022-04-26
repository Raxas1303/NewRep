package cycles;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = 5;

		System.out.println("Введите количество лет: ");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Введите еще раз:");
			n = scanner.nextInt();
		}

		double sum = s;
		for (int i = 1; i <= n; i++)
			sum = sum + (sum * 0.03);
		System.out.println(sum);
		scanner.close();
	}
}
