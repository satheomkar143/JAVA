import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<String, Integer> treeMap = new TreeMap<>();
	
	treeMap.put("B",3);
	treeMap.put("A",1);
	treeMap.put("C",3);
	
	System.out.println(treeMap);
}
}
