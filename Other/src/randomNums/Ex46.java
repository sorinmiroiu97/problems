package randomNums;

import java.util.Random;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {

		Random r = new Random();

		int rand = 1 + r.nextInt(100);
		
		System.out.println("Try 'n' guess the number!");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num == rand)
			System.out.println("you guessed it...wow...");
		else if(num < rand)
			System.out.println("too low " + rand);
		else if(num > rand)
			System.out.println("too high " + rand);

	}

}
