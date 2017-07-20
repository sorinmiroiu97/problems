package whileLoops;

import java.util.Scanner;

public class Ex52 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int pin = 12345;
		int tries = 4;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = sc.nextInt();
//		tries++;

		while ( entry != pin && tries > 0 )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = sc.nextInt();
			tries--;
		}
		
		sc.close();
		
		if ( entry == pin )
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if ( tries < 1 )
			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		
	}
	
}
