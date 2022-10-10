package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("ab");
		al.add("cb");
		al.add("db");
		al.add("eb");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
