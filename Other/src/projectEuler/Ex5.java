package projectEuler;

public class Ex5 {

	static int max = 20;

	public static boolean isIt(int num) {
		
		boolean isIt = false;
		for (int i = 1; i <= max; i++) {
			if (num % i == 0) {
				isIt = true;
			} else {
				isIt = false;
				break;
			}
		}
		return isIt;
	}

	public static void main(String[] args) {

		int num = max;
		while (!isIt(num)) {
			num += max;
		}
		System.out.println(num);
	}

}
