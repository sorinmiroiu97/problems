package keyboardInput;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello.  What is your name?");
		String name= sc.next();
		System.out.println(name);
		
		System.out.println("Hi, " +  name  + " How old are you?");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("So you're " + age + ", eh?  That's not old at all! " 
				+ "How much do you make," + name + "?");
		int wage = sc.nextInt();
		System.out.println(wage);
		
		System.out.println(wage + "I hope that's per hour and not per year! LOL!");
		
		sc.close();
		
	}
	
}
