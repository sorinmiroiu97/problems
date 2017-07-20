package whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String again;

		do{
			int flip = rand.nextInt(2);
			String coin;

			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			again = sc.next();
		}while (again.equals("y"));
		
		sc.close();
	}

}
