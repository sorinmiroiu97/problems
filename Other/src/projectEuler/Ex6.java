package projectEuler;

public class Ex6 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i * i;
		}

		int s = 0;
		for (int i = 0; i <= 100; i++) {
			s += i;
		}

		System.out.println("The difference is " + ((s * s) - sum));
	}

}
