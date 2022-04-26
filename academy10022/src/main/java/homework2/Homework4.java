package homework2;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество игроков: ");
		int players = sc.nextInt();
		int cards = 5;

		String[] suit = { "Пики", "Крести", "Чирви", "Буби" };
		String[] card = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };

		int all = suit.length * card.length;

		if (cards * players > all) {
			System.out.println("Количество игроков превышает возможное.");
		} else if (players <= 0) {
			System.out.println("Должно быть 1 и более игроков.");
		} else {
			System.out.println("Раздача!");
		}

		String[] deck = new String[all];
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = card[i] + " " + suit[j];
			}
		}

		for (int i = 0; i < all; i++) {
			int a = i + (int) (Math.random() * (all - i));
			String temp = deck[a];
			deck[a] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < players * cards; i++) {
			System.out.println(deck[i]);
			if (i % cards == cards - 1)
				System.out.println();
		}
		sc.close();
	}
}
