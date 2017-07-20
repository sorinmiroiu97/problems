package projectEuler;

public class Ex10 {

	public static void main(String[] args) {
		int n = 2;
		int sum = 0;
		while (n < 2000000) {
			for (int d = 2; d <= n / 2; d++) {
				if (n % d == 0) {
					sum += n;
				}
			}
			n++;
		}
		
		System.out.println(n);

	}

}
