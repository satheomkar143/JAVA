import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		System.out.println(list);

		list.addFirst("C");
		list.addLast("D");
		System.out.println(list);

		list.add(2, "E");
		System.out.println(list);

		list.remove("B");
		System.out.println(list);

		list.remove(3);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
