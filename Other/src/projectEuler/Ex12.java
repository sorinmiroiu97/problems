package projectEuler;

public class Ex12 {
	
	public static void main(String[] args) {
		
		int number = 0;
		int i = 1;
		 
		while(divisorsNumber(number) < 500){
		    number += i;
		    i++;
		    System.out.println(number);
		}
		
	}
	
		private static int divisorsNumber(int n) {
			int count = 0;
			int rad = (int) Math.sqrt(n);
			for (int i = 1; i < rad; i++) {
				if (n % i == 0)
					count += 2;
			}
			if (rad * rad == n)
				count--;
			return count;
		}

}
