package operators;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите месяц: ");
		String s = scanner.nextLine();

		switch (s) {
		case "Январь":
			System.out.println("Первый месяц в году.");
			break;
		case "Февраль":
			System.out.println("Второй месяц в году.");
			break;
		case "Март":
			System.out.println("Третий месяц в году.");
			break;
		case "Апрель":
			System.out.println("Четвертый месяц в году.");
			break;
		case "Май":
			System.out.println("Пятый месяц в году.");
			break;
		case "Июнь":
			System.out.println("Шестой месяц в году.");
			break;
		case "Июль":
			System.out.println("Седьмой месяц в году.");
			break;
		case "Август":
			System.out.println("Восьмой месяц в году.");
			break;
		case "Сентябрь":
			System.out.println("Девятый месяц в году.");
			break;
		case "Октябрь":
			System.out.println("Десятый месяц в году.0");
			break;
		case "Ноябрь":
			System.out.println("Одинадцатый месяц в году.");
			break;
		case "Декабрь":
			System.out.println("Двенадцатый месяц в году.");
			break;

		}
		scanner.close();
	}
}
