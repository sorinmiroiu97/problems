package ifStm;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gender: M/F");
		String gender = sc.nextLine();
		System.out.println("First name: ");
		String first = sc.nextLine();
		System.out.println("Last name: ");
		String last = sc.nextLine();
		System.out.println("Age: ");
		int age = sc.nextInt();
		sc.close();
		
		if(gender.equals("M"))
			System.out.println("Greetings mr. " + first + " " + last);
		else if(age <= 20 && gender.equals("F"))
			System.out.println("Greetings ms. " + first + " " + last);
		else if(age > 20 && gender.equals("F"))
			System.out.println("Greetings mrs. " + first + " " + last);
		
		
	}

}
