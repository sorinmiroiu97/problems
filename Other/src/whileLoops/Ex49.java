package whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num = 1+ rand.nextInt(10);
		
		System.out.println("Try 'n guess the random num ");
		
		int entry = sc.nextInt();

		while (entry != num) {
			System.out.print("try again: ");
			entry = sc.nextInt();
		}
		sc.close();

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

	}

}
