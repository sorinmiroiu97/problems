package ifStm;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = 0;

		System.out.println("Are you ready for a quiz?(Y/N)");

		sc.nextLine();

		System.out.println("Okay, here it comes!");

		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("1) Melbourne , 2) Anchorage , 3) Juneau");

		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("That's correct!");
			score++;
		} else
			System.out.println("Wrong!");

		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("1) yes , 2) no ");

		int b = sc.nextInt();

		if (b == 2) {
			System.out.println("That's correct!");
			score++;
		} else
			System.out.println("Wrong!");
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("1) 5 , 2) 11 , 3) 15,3 ");

		int c = sc.nextInt();
		
		sc.close();

		if (c == 2) {
			System.out.println("That's correct!");
			score++;
		} else
			System.out.println("Wrong!");
		
		System.out.println("Score: " + score);

	}

}
