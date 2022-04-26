package classwork;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = 5;
		number = -number;
		System.out.println(number);
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);
		char a = 'A';
		a = (char) (a + 1);
		System.out.println((int) 'A');
		int number1 = 10;
		System.out.println(number1);
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;
		System.out.println(number1);
		int j = 0;
		System.out.println(j++);
		System.out.println(++j);
	}
}
