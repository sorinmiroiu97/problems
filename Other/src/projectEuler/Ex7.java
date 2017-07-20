package projectEuler;

public class Ex7 {

	public static void main(String[] args) {

		int count = 0;
		int n = 2;
		
		while (count != 10001) {
			for (int d = 2; d <= n/2; d++) {
				if (n % d == 0) {
					count++;
					if(count==10001)
						System.out.println(n);
				}
			}
			n++;
		}

	}

}
