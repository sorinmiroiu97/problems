package ifStm;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		sc.close();
		
		if(age < 16)
			System.out.println("You can't drive");
		if(age < 18)
			System.out.println("You can't vote");
		if(age < 25)
			System.out.println("You can't rent a car");
		if(age > 25)
			System.out.println("You can do anything that's legal");
		
	}

}
