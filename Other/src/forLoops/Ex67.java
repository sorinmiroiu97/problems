package forLoops;

import java.util.Scanner;

public class Ex67 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
        int n = sc.nextInt();
        int by = sc.nextInt();
        sc.close();

        for ( int i = j ; i <= n ; i+=by )
        {
        	System.out.println(i);
        }

	}

}
