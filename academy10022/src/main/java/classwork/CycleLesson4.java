package classwork;

public class CycleLesson4 {
	public static void main(String[] args) {
		int i = 13;
		int result = 0;
		while (i <= 100) {
			if (i % 12 == 0) {
				result = i;
				System.out.println("STOP");
				break;
			}
		System.out.println("i = " + i++);
		}
	System.out.println("Цикл завершеню" + "result:" + result);
	}
}
