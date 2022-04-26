package newClasswork;

import java.util.Random;

public class RandDemo {
public static void main(String[] args) {
	Random rand = new Random() {
		@Override
		public int nextInt() {
			return 1;
		}
	};
}
}