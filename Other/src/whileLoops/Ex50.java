package whileLoops;

import java.util.Random;

public class Ex50 {

	public static void main(String[] args) {

		System.out.println("THE DICE!");

		Random r = new Random();

		int x = 1 + r.nextInt(6);
		int y = 1 + r.nextInt(6);

		while (x != y) {
			x = 1 + r.nextInt(6);
			y = 1 + r.nextInt(6);
			System.out.println("the first num " + x);
			System.out.println("the first num " + y);
			System.out.println("the sum " + (x + y));
		}

	}

}
