package arrays;

import java.util.Scanner;

public class Ex147 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("type a value: ");
		int val = sc.nextInt();
		sc.close();
		
		int[] arr = new int[10];
		int ok = 0;
		
		System.out.print("array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + (int) (Math.random() * 50);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == val){
				ok++;
				System.out.println(val + "is in the array at pos: " + i + " and was found: " + ok + " times");
			}
		}
		
		if(ok==0)
			System.out.println(val + " is not in the array");

	}

}
