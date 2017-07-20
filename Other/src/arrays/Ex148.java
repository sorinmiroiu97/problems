package arrays;

public class Ex148 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int maxi = 0;
		
		System.out.print("array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + (int) (Math.random() * 50);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxi)
				maxi = arr[i];
		}
		
		System.out.println(maxi);
		
	}

}
