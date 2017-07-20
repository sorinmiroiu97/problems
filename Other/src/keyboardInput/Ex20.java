package keyboardInput;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert your kgs: ");
		double weight = sc.nextDouble();
		
		System.out.println("insert your h, in meters: ");
		double height = sc.nextDouble();
		
		sc.close();
		
		double bmi = weight/Math.pow(height, 2);
		
		System.out.println("your bmi: " + bmi);
	}
	
}
