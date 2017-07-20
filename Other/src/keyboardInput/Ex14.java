package keyboardInput;

import java.util.Scanner;

public class Ex14 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int age;
		String heightFeet, heightInches;
		double weight;

		System.out.print("How old are you? ");
		age = sc.nextInt();

		System.out.print("How tall are you? (feet and inches) ");
		heightFeet = sc.next();
		heightInches = sc.next();

		System.out.print("How much do you weigh? ");
		weight = sc.nextDouble();
		
		sc.close();
		
		System.out.println("So you're " + age + " old, " + heightFeet+heightInches + " tall and " + weight + " heavy.");

	}

}
