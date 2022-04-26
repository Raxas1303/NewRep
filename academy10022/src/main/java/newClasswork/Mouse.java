package newClasswork;

public interface Mouse {

	void clickright();

	void clickleft();

	void scrollUp();

	void scrollDown();

	default void eatCheese() {
		System.out.println("Im eating cheese");
	}

}
