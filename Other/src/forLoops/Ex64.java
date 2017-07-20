package forLoops;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = sc.nextLine();
        sc.close();

        for ( int n = 1 ; n <= 10 ; n++ )
        {
        	if(n%2==0)
        		System.out.println( n + ". " + message );
        }
		
	}

}
