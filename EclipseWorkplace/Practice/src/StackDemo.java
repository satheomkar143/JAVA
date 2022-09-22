import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("America");
		stack.push("England");
		stack.push("India");

		System.out.println("Original stack: " + stack);

		String popElement = stack.pop();
		System.out.println("popped element: " + popElement);
		System.out.println("new stack: " + stack);

		String Peek = stack.peek();
		System.out.println("peeked element: " + Peek);
		System.out.println("after peek: " + stack);
	}
}
