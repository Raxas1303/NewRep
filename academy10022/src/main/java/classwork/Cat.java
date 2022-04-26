package classwork;

public class Cat {
	int age;
	String nickname;

	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}

	public void sleep() {
		System.out.println("��� ����:" + nickname);
	}

	public void eat() {
		System.out.println("��� ���:" + nickname);
	}

	public void grow(int addAge) {
		addAge += addAge;
		System.out.println("��� �����:" + age);
	}

	public int getAge() {
		return age;
	}

	public String getnickname() {
		return nickname;
	}

	public int setAge(int age) {
		return this.age = age;
	}

	public String setnickname(String nickname) {
		return this.nickname = nickname;
	}
}
