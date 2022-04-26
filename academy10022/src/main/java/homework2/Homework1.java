package homework2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите первое слово:");
		String word1 = scanner.nextLine();
		System.out.println("Введите второе слово:");
		String word2 = scanner.nextLine();
		
		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		int amount1 = 0;
		int amount2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			amount1 += (int) arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			amount2 += (int) arr2[i];
		}

		if (amount1 == amount2) {
			System.out.println("Слова являются перестановкой друг друга.");
		} else {
			System.out.println("Cлова не являются перестановкой друг друга.");
		}

		scanner.close();
	}
}