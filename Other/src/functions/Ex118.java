package functions;

import java.util.Scanner;

public class Ex118 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 12; i++) {
			System.out.println(num + "*" + i + " = " + num*i);			
		}
		
	}

}
