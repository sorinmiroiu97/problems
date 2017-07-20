package projectEuler;

public class Ex2 {

	public static void main(String[] args) {

		int c = 0, a = 0, b = 1, s = 0;

		while (a + b < 4000000) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			if (c % 2 == 0) {
				s += c;
			}
		}

		System.out.println("Sum: " + s);

	}

}
