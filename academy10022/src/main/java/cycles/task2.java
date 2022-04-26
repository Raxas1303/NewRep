package cycles;

import java.util.Scanner;

public class task2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число:");
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <=n; i++)
			sum=sum+i;
		System.out.println(sum);
		scanner.close();
	}
}