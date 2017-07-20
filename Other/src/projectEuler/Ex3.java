package projectEuler;

public class Ex3 {

	public static void main(String[] args) {

		long num = 600851475143L; // 13195
		long result = 0L;
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				if (num % i == 0) {
					int a = i;
					result = num / i;
					System.out.printf("Prime factor: %d\n", a);
					if (!isPrime(result)) {
						i = -1;
						num = result;
					} else {
						System.out.printf("Prime factor: %d\n", result);
						break;
					}
				}
			}
		}

	}

	public static boolean isPrime(long num) {
		boolean prime = false;
		for (int i = 2; i <= num; i++) {
			if (num != i && num % i == 0) {
				prime = false;
				break;
			} else
				prime = true;
		}
		return prime;
	}

}
