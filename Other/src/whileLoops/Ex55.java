package whileLoops;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(num != 0){
			sum+= num;
			System.out.println("the sum: " + sum);
			num = sc.nextInt();
		}
		
		sc.close();
		
	}

}
