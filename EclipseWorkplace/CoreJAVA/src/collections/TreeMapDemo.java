package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("B",3);
		treeMap.put("A",1);
		treeMap.put("C",3);
		
		Set<Map.Entry<String, Integer>> st = treeMap.entrySet();
		
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + " ");
			System.out.println(me.getValue());
		}

	}
}
