package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class task7 {
	public static void main(String[] args) {

		Map<Toy, String> map = new HashMap<>();
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = new Toy();

		map.put(t1,"a");
		map.put(t2,"b");
		map.put(t3,"c");
	


	}
	public static void printKey(HashMap<String, Toy>Toy) {
		for(String key : Toy.keySet()) {
			System.out.println(key);
		}
	}
	public static void printValue(HashMap<String, Toy>Toy) {
		for(Toy value:Toy.values()) {
			System.out.println(value);
		}
	}
}
