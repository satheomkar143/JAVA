package basicProgram;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
	public static void main(String[] args) {

		// using math.random() method
		System.out.println(Math.random());
		System.out.println(Math.random());

		System.out.println(Math.random() * (400 - 200 + 1) + 200);

		// using Random class

		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);

		double y = random.nextDouble();
		System.out.println(y);

		float a = random.nextFloat();
		System.out.println(a);

		long p = random.nextLong();
		System.out.println(p);

		boolean b = random.nextBoolean();
		System.out.println(b);
		
		//using the ThreadLocalRandom class.
		
		int t=ThreadLocalRandom.current().nextInt();
		System.out.println(t);
	}
}
