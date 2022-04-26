package classwork;

public class Main1 {

	public static void main(String[] args) {
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat(1);
		Cat Cat3 = new Cat(2, "Vaska");
		Cat Cat4 = new Cat(2, "Gena");
		Cat Cat5 = new Cat(2, "Zina");
		Cat Cat6 = new Cat(2, "Dima");
		Cat Cat7 = new Cat(2, "Barsik");

//		Cat1.sleep();
//		Cat2.sleep();
//		Cat6.eat();
//		Cat4.grow(6);
//		Cat3.grow(5);
//		Cat5.sleep();
//		Cat7.eat()
		int Cat3Age = Cat3.getAge();
		System.out.println(Cat3Age);
		String Cat4nickname = Cat4.getnickname();
		System.out.println(Cat4nickname);
		System.out.println(Cat3.getAge());
		Cat3.setAge(200);
		System.out.println(Cat3.getAge());
		System.out.println(Cat6.getnickname());
		Cat6.setnickname("Blue");
		System.out.println(Cat6.getnickname());
	}
}
