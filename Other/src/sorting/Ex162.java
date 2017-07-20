package sorting;

import java.util.Random;

public class Ex162 {

	public static void selection_sort(int[] a) {
		
		int i, j, minIndex, tmp;
		int n = a.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (a[j] < a[minIndex])
					minIndex = j;
			if (minIndex != i) {
				tmp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = tmp;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for (i = 0; i < arr.length; i++)
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// Sort it
		selection_sort(arr);

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
