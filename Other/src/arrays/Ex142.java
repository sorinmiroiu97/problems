package arrays;

public class Ex142 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 1 + (int) (Math.random() * 100);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}

		arr1[(arr1.length - 1)] = -7;

		System.out.print("Array 1: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("Array 2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
