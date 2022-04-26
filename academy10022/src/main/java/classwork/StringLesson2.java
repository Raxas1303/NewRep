package classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLesson2 {
//	private static final String str = "Java\\s+\\d+";
//	private static final Pattern pattern = Pattern.compile(str);

	public static void main(String[] args) {
		System.out.println(test("cab"));
		System.out.println(test("ccab"));
		System.out.println(test("cccab"));
		System.out.println(test("casdaab"));
		System.out.println(test("ccccccccccccccccccccccccccccab"));
		System.out.println(test("cccasab"));
	}
//
	public static boolean test(String str) {
		Pattern pattern = Pattern.compile("c{1,3}ab");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
//	public static void main(String[] args) {
//		System.out.println(test("google.com"));
//		System.out.println(test("reference1.by"));
//		System.out.println(test("reference1.org"));
//	}
//
//	public static boolean test(String str) {
//		Pattern pattern = Pattern.compile(".+\\.(com|ua|by|org|ru)");
//		Matcher matcher = pattern.matcher(str);
//		return matcher.matches();
//	public static void main(String[] args) {
//		String text = "Java 5, Java   6, Java   7, Java     8, Java        12";
//		Matcher matcher = pattern.matcher(text);
//		while (matcher.find()) {
//			int start = matcher.start();
//			int end = matcher.end();
//			System.out.println(text.substring(start, end));
//		}
//		System.out.println(text.replaceAll("\\s+", " "));
	}

}
