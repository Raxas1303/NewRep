package hardWork;

import java.util.Arrays;
import java.util.Random;

public class ExamDemo {

	public static void main(String[] args) {

		Random random = new Random();
		Integer Marks = random.nextInt(5) + 1;

		Integer[] mark = new Integer[Marks];

		for (int i = 0; i < mark.length; i++) {
			mark[i] = random.nextInt(11);
		}

		Exam<Integer> exam = new Exam<>(mark);
		System.out.println("Первоначальный вид:" + Arrays.toString(mark));

		exam.add(3, 6);
		System.out.println("Добавление отметки:     " + Arrays.toString(mark));

		exam.remove(2);
		System.out.println("Удаление отметки:  " + Arrays.toString(exam.getMark()));

		System.out.println(exam.averageMark());
	}

}