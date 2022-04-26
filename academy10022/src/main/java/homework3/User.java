package homework3;

import java.util.Scanner;

public class User {

	private int age;
	private String name;
	private double money;
	private String dateOfBirth;
	private String phoneNumber;
	private String email;

	public User() {
		super();
	}

	public User(int age, String name, double money) {
		super();
		this.age = age;
		this.name = name;
		this.money = money;

		System.out.println("Введите дату рождения " + name);

		this.dateOfBirth = SCANNER.nextLine();

		if (Regex.test(dateOfBirth) == true) {
			System.out.println("Дата прошла проверку.");
		} else if (Regex.test(dateOfBirth) == false) {
			System.out.println("Измените дату на формат dd/mm/yyyy(dd-mm-yyyy)");
			while (Regex.test(dateOfBirth) == false) {
				System.out.println("Введите ещё раз");
				dateOfBirth = SCANNER.nextLine();
			}
		}
		System.out.println("Введите номер телефона " + name);

		this.phoneNumber = SCANNER.nextLine();

		BelarusPhoneNumberValidator v = new BelarusPhoneNumberValidator();
		if (v.validate(phoneNumber) == false) {
			System.out.println("Формат ввода: +375XXXXXXXXX");
			while (v.validate(phoneNumber) == false) {
				System.out.println("Введите ещё раз");
				phoneNumber = SCANNER.nextLine();
			}
		} else if (Regex.test(dateOfBirth) == true) {
			System.out.println("Номер телефона прошел проверку.");
		}
	}

	public User(int age, String name, double money, String phoneNum, String email) {
		super();
		this.age = age;
		this.name = name;
		this.money = money;
		this.email = email;
	}

	public static final Scanner SCANNER = new Scanner(System.in);

	public double sellerMoney(double fullPrice) {
		this.money += fullPrice;
		return money;
	}

	public double buyerMoney(double fullPrice) {
		this.money -= fullPrice;
		return money;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNum() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", maney=");
		builder.append(money);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", phoneNum=");
		builder.append(phoneNumber);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}