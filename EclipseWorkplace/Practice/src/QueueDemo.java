import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		queue.add("india");
		queue.add("Germany");
		queue.add("America");

		System.out.println("original queue: " + queue);

		queue.remove();
		System.out.println("after removing head element: " + queue);

		String head = queue.peek();
		System.out.println("head of a queue: " + head);

		head = queue.poll();
		System.out.println("removerd head: " + head);

		System.out.println("new queue: " + queue);

	}

}
