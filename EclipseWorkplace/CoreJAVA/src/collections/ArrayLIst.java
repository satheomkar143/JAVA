package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIst {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("ab");
		al.add("cb");
		al.add("db");
		al.add("eb");
		al.add("fb");
		System.out.println(al);

		List<Integer> a = new ArrayList<>();
		a.add(20);
		a.add(40);
		a.add(10);
		a.add(30);
		System.out.println(a);

		Collections.sort(a);
		System.out.println(a);
	}
}
