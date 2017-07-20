package randomNums;

import java.util.Random;
import java.util.Scanner;

public class Ex76_blackjackproject {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int pNum1 = 1 + rand.nextInt(10);
		int pNum2 = 1 + rand.nextInt(10);
		int sum1 = pNum1 + pNum2;
		
		System.out.println("You've got: " + pNum1 + " " + pNum2);
		System.out.println("The total is: " + sum1);
		
		int dNum1 = 1 + rand.nextInt(10);
		int dNum2 = 1 + rand.nextInt(10);
		int sum2 = dNum1 + dNum2;
		
		System.out.println("He's got: " + dNum1 + " and the other one is hidden");
		System.out.println("The total is hidden also");
		
		int turn = 0;
		
		while(sum1<21 || sum2<21){
			if(turn%2==0){
				System.out.println("Player's turn. hit or stay?");
				String player = sc.nextLine();
				if(player.equals("stay"))
					continue;
				else if(player.equals("hit")){
					sum1=sum1+ (1+rand.nextInt(10));
					System.out.println("player's sum: " + sum1);
				}
			}
			else{
				System.out.println("Dealer's turn. hit or stay?");
				int choice = 1+rand.nextInt(2);
				if(choice==1)
					continue;
				else if(choice!=1){
					sum2=sum2+ (1+rand.nextInt(10));
					System.out.println("dealer's sum: " + sum2);
				}
			}
			
			
			if(sum1>=21 || sum2>=21)
				break;
			
			turn++;
		}
		
		sc.close();
		
		if (sum1 > sum2)
			System.out.println("Player won!");
		else
			System.out.println("Dealer lose!");
		
	}
	
}
