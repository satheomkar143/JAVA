package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("a", 100);
		hs.put("g", 500);
		hs.put("s", 900);
		hs.put("d", 300);

		Set<Map.Entry<String, Integer>> st = hs.entrySet();
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + " ");
			System.out.println(me.getValue());
		}
	}

}
