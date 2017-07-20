package projectEuler;

public class Ex9 {

	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				//a+b+c=1000
				//c=1000-a-b
				int c = 1000 - a - b;
				if (pythagorean(a, b, c))
					System.out.println(a * b * c);
			}
		}

	}

	public static boolean pythagorean(int a, int b, int c) {
		if (c * c == a * a + b * b)
			return true;
		else
			return false;
	}

}
