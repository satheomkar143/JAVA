package collections;

import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.addFirst("A");
		li.addLast("Z");
		System.out.println(li);
		li.add(2, "omkar");
		System.out.println(li);

	}
}
