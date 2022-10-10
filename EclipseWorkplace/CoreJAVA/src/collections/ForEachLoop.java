package collections;

import java.util.LinkedList;

public class ForEachLoop {
	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<>();
		li.add("a");
		li.add("n");
		li.add("d");
		li.add("g");

		for (String str : li) {
			System.out.println(str);
		}
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(6);
		l.add(8);
		l.add(4);
		for (Integer in : l) {
			System.out.println(in);
		}
	}

}
