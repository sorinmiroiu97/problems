package whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("THKING OF A NBR FROM 1-10.  TRY 2 GESS!");

		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();

		Random r = new Random();

		int num = 1 + r.nextInt(10);
		int ok = 1;
		
		while(guess != num){
			ok++;
			guess = sc.nextInt();
		}
		
		sc.close();
		
		if (guess == num)
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS" + num + "!");
		else
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + num);
		System.out.println("it took you " + ok + " tries");
	}

}
