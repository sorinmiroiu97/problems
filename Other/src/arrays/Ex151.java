package arrays;

import java.util.Scanner;

public class Ex151 {

	public static void main(String[] args) {
		
		String[] person = { "alpha", "bravo", "charlie", "delta", "echo" };
		double[] grade = { 23.5, 68.4, 45.3, 99.9, 100.0 };
		int[] id = { 123456, 2345, 43256, 93586, 29353};

		for (int i = 0; i < 5; i++)
			System.out.println(person[i] + " " + grade[i] + " " + id[i]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("find info by ID: ");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < 5; i++){
			if(num == id[i])
				System.out.println(person[i] + " " + grade[i] + " " + id[i]);
		}
		
	}

}
