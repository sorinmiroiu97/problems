package arrays;

public class Ex141 {
	
	public static void main(String[] args) {
		int[] arr = new int[1000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 + (int) (Math.random() * 90);
			System.out.print(arr[i] + "  ");
			if(i%20==0)
				System.out.println();
		}
	}
	
}
