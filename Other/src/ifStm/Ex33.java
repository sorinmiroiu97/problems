package ifStm;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\""
				+ "or into the \"kitchen\"?");
		String str1 = sc.nextLine();
		
		if(str1.equals("upstairs")){
			System.out.println("Upstairs you see a hallway.  At the end of the hallway "
					+ "is the master\"bedroom\".  "
							+ "There is also a \"bathroom\" off the hallway. "
									+ " Where would you like to go?");
			String str3 = sc.nextLine();
			if(str3.equals("bedroom")){
				System.out.println("Here you see your angry mom! Hurry and 'run' or "
						+ "be 'brave' and confront her! ");
				String str4 = sc.nextLine();
				if(str4.equals("run")){
					System.out.println("You escaped, but sliped on the floor and broke ur neck!");
				}
				else System.out.println("She killed you by torture!!!");
			}
			else if(str3.equals("bathroom")){
				System.out.println("You remember you haven't washed your teeth."
						+ "You can either 'wash' them or 'not'.");
				String str5 = sc.nextLine();
				if(str5.equals("wash"))
					System.out.println("You died anyway cause it's mah game!");
				else System.out.println("You died anyway cause it's mah game!");
			}
			
			}
		else if(str1.equals("kitchen")){
			System.out.println("There is a long countertop with dirty dishes everywhere." 
					+ "Off to one side there is, as you'd expect, a refrigerator."
					+ "You may open the \"refrigerator\" or look in a \"cabinet\".");
			String str2 = sc.nextLine();
			if(str2.equals("refrigerator")){
				System.out.println("Inside the refrigerator you see food and stuff. "
						+ " It looks pretty nasty. Would you like to eat some of the food?"
						+ " (\"yes\" or \"no\")");
				String ans1 = sc.nextLine();
				if(ans1.equals("yes"))
					System.out.println("you die");
				else System.out.println("You die of starvation... eventually.");
			}
			else if(str2.equals("cabinet")){
				System.out.println("Here you find your long missing grandma. What do u do?"
						+ "Hug or run?");
				sc.nextLine();
				System.out.println("She kills you anyway!");
			}
		}
		
		System.out.println("Thanks for playing,I'm tired"
				+ " of making nested if statements.");
		
		sc.close();
		
	}

}
