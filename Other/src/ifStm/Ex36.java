package ifStm;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("insert your kgs: ");
		double weight = sc.nextDouble();

		System.out.println("insert your h, in meters: ");
		double height = sc.nextDouble();

		sc.close();

		double bmi = weight / Math.pow(height, 2);

		System.out.println("your bmi: " + bmi);
		
		if(bmi < 18.5)
			System.out.println("underweight");
		else if(bmi>= 18.5 && bmi <= 24.9)
			System.out.println("normal weight");
		else if(bmi >= 25 && bmi <= 29.9)
			System.out.println("overweight");
		else System.out.println("obese");
		
	}

}
