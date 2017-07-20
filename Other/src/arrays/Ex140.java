package arrays;

public class Ex140 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + (int) (Math.random() * 100);
			System.out.println("Slot " + i + " contains " + arr[i]);
		}

	}

}
