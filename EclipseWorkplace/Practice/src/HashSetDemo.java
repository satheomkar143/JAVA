import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hastSet = new HashSet<>();

		hastSet.add("A");
		hastSet.add("B");
		boolean r1 = hastSet.add("C");
		System.out.println(r1);
		boolean r2 = hastSet.add("C");
		System.out.println(r2);

		System.out.println(hastSet);
		System.out.println("set contain C or not: " + hastSet.contains("C"));

		hastSet.remove("A");
		System.out.println("after removing A: " + hastSet);

		System.out.println("size of hashset: " + hastSet.size());

		for (String item : hastSet) {
			System.out.println(item);

		}
	}
}
