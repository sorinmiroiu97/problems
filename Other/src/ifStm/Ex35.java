package ifStm;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Question 1: Does it belong inside or outside or both? ");
		
		String str1 = sc.nextLine();
		
		System.out.println("Question 2: Is it alive? ");
		
		String str2 = sc.nextLine();
		sc.close();
		
		if(str1.equals("inside") && str2.equals("yes")){
			System.out.println("The alien...greetings hooman");
		}
		if(str1.equals("outside") && str2.equals("yes")){
			System.out.println("The hooman, not the ant, I mean yeah..");
		}
		if(str1.equals("both") && str2.equals("yes")){
			System.out.println("Surely a dog");
		}
		if(str1.equals("inside") && str2.equals("no")){
			System.out.println("The library..like in shelves with books on them");
		}
		if(str1.equals("outside") && str2.equals("no")){
			System.out.println("That's eaaasy...my batmobil");
		}
		if(str1.equals("both") && str2.equals("no")){
			System.out.println("I truely don't know this one...maybe my grandma...");
		}
		
	}

}
