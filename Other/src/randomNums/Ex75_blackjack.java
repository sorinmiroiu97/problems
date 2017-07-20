package randomNums;

import java.util.Random;

public class Ex75_blackjack {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int pNum1 = 1+rand.nextInt(10);
		int pNum2 = 1+rand.nextInt(10);
		int sum1 = pNum1+ pNum2;
		System.out.println("You've got: " + pNum1 + " " + pNum2);
		System.out.println("The total is: " + sum1);
		int dNum1 = 1+rand.nextInt(10);
		int dNum2 = 1+rand.nextInt(10);
		int sum2 = dNum1+ dNum2;
		System.out.println("He's got: " + dNum1 + " " + dNum2);
		System.out.println("The total is: " + sum2);
		
		if(sum1>sum2)
			System.out.println("You won!");
		else
			System.out.println("You lose!");
	}

}
