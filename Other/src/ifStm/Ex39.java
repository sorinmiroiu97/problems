package ifStm;

import java.util.Scanner;

public class Ex39 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your last name: ");
		String name = sc.nextLine();
		sc.close();
		
		if(name.compareTo("Carswell") < 0 || name.equals("Carswell"))
			System.out.println("you don't have to wait long");
		else if(name.compareTo("Carswell") > 0 && name.compareTo("Jones") < 0 || name.equals("Jones"))
			System.out.println("that's not bad");
		else if(name.compareTo("Jones") > 0 && name.compareTo("Smith") < 0 || name.equals("Smith"))
			System.out.println("looks like a bit of a wait");
		else if(name.compareTo("Smith") > 0 && name.compareTo("Young") < 0 || name.equals("Young"))
			System.out.println("it's gonna be a while");
		else System.out.println("not going anywhere for a while?");
	}
	
}
