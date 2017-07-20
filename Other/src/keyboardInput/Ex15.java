package keyboardInput;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a word!");
		System.out.println(sc.next());
		
		System.out.println("Give me a second word!");
		System.out.println(sc.next());
		
		System.out.println("Great, now your favorite number?");
		System.out.println(sc.nextInt());
		
		System.out.println("And your second-favorite number...");
		System.out.println(sc.nextInt());
		
		sc.close();
		
		System.out.println("Whew!  Wasn't that fun?");
	}
	
}
