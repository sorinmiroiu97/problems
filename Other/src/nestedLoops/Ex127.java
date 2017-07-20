package nestedLoops;

public class Ex127 {

	public static void main(String[] args) {

		// A + 2 = B - 2 = C × 2 = D ÷ 2
		// A + B + C + D = 45

		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j <= 1000; j++) {
				for (int k = 0; k <= 1000; k++) {
					for (int l = 0; l <= 1000; l++) {
						if (i + j + k + l == 45)
							if (i + 2 == j - 2 && k * 2 == l / 2 && i + 2 == l / 2)
								System.out.println(i + " " + j + " " + k + " " + l);
					}
				}
			}
		}

	}

}
