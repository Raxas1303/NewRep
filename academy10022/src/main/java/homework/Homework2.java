package homework;

import java.io.IOException;
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите тип данных:");
		String type = scanner.nextLine();
		switch (type) {
		case "int":
			System.out.println("Введите переменную типа int:");
			int a = scanner.nextInt();
			System.out.println("Остаток от деления на 2:" + (a % 2));
			break;
		case "double":
			System.out.println("Введите переменную типа double:");
			double b = scanner.nextDouble();
			System.out.println("70% от числа:" + (b * 0.7));
			break;
		case "float":
			System.out.println("Введите переменную типа float:");
			float c = scanner.nextFloat();
			System.out.println("Квадрат введенного числа:" + (c * c));
			break;
		case "char":
			System.out.println("Введите символ:");
			int x = System.in.read();
			char z = (char) x;
			System.out.println("Код символа:" + z + "=" + x);
			break;
		case "String":
			System.out.println("Введите строку:");
			String o = scanner.nextLine();
			System.out.println("Hello " + o);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scanner.close();

	}
}