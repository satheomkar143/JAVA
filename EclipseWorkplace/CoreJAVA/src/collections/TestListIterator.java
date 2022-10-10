package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("ab");
		al.add("cb");
		al.add("db");
		al.add("eb");

		ListIterator<String> lit = al.listIterator();
		
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
