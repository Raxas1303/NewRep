package cycles;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = scanner.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++)
			result = result * i;
		System.out.println(result);
		scanner.close();
	}
}
