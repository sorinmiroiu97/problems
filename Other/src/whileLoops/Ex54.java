package whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		
		System.out.println("THKING OF A NBR FROM 1-10.  TRY 2 GESS!");

		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();

		Random r = new Random();

		int num = 1 + r.nextInt(10);
		int ok = 1;
		
		while(guess != num && ok < 7){
			if(guess < num)
				System.out.println("too low");
			else if(guess > num)
				System.out.println("too high");
			else{
				System.out.println("you guessed it");
				break;
			}
			guess = sc.nextInt();
			ok++;
		}
		
		sc.close();
		
	}

}
