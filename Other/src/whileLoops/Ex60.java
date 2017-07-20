package whileLoops;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		
		System.out.println("SQUARE ROOT! Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num < 0){
			System.out.println("Positive nums only!!!");
			num = sc.nextInt();
		}
		
		System.out.println("the result: " + Math.sqrt(num));
		
		sc.close();
		
	}

}
