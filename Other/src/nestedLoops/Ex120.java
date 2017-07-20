package nestedLoops;

import java.util.Scanner;

public class Ex120 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		for (int thous = 0; thous < x; thous++) 
			for (int hund = 0; hund < x; hund++) 
				for (int tens = 0; tens < x; tens++) 
					for (int ones = 0; ones < x; ones++) {
						System.out.print(" " + thous + "" + hund + "" + tens + "" + ones + "\r");
						Thread.sleep(500);
					}

		System.out.println();

	}

}
