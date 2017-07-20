package keyboardInput;

import java.util.Scanner;

public class Ex18 {

	public static void main(String args[]) {
		
//		Hello.  What is your name? Gramps
//
//				Hi, Gramps!  How old are you? 87
//
//				Did you know that in five years you will be 92 years old?
//				And five years ago you were 82! Imagine that!
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello.  What is your name?");
		String name = sc.next();
		
		System.out.println("And how old r u?");
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println(name + " did you know that in five years you will be " + (age+5) +" years old?");
		System.out.println("And five years ago you were " + (age-5) + "! Imagine that!");
		
	}

}
