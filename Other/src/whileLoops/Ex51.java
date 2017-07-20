package whileLoops;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = sc.nextLine();
		System.out.println("how many repeats?");
		int x = sc.nextInt();
		sc.close();

		int n = 0;
		while ( n < x )
		{
			System.out.println( ((n+1)*10) + ". " + message );
			n++;
		}
		
	}

}
