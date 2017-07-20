package randomNums;

import java.util.Random;
import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int rand = 1 + r.nextInt(3);

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash"
				+ "He glances at you out of the corner of his eye and starts shuffling."
				+ " He lays down three cards. Which one is the ace?");

		System.out.println("##  ##  ##");
		System.out.println("##  ##  ##");
		System.out.println(" 1   2   3");

		int num = sc.nextInt();
		sc.close();

		if (num != rand)
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + rand);
		else
			System.out.println("You nailed it! Fast Eddie reluctantly" + " hands over your winnings, scowling.");
		
		if (rand == 1) {
			System.out.println("AA  ##  ##");
			System.out.println("AA  ##  ##");
			System.out.println(" 1   2   3");
		}
		else if(rand == 2){
			System.out.println("##  AA  ##");
			System.out.println("##  AA  ##");
			System.out.println(" 1   2   3");
		}
		else if(rand == 3){
			System.out.println("##  ##  AA");
			System.out.println("##  ##  AA");
			System.out.println(" 1   2   3");
		}

	}

}
