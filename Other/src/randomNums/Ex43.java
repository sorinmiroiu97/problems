package randomNums;

import java.util.Random;
import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
		
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		sc.close();
		
		Random r = new Random();
		
		int num = r.nextInt(10);
		
		if(guess == num)
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS" + num + "!");
		else System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + num);
		
	}

}
