package functions;

import java.util.Random;

public class Ex98 {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		int r;

		for (int i = 0; i < 100000; i++) {
			r = 1 + rand.nextInt(5);
			if(r==1)
				first();
			else if(r==2)
				second();
			else if(r==3)
				third();
			else if(r==4)
				fourth();
			else if(r==5)
				fifth();
			Thread.sleep(100);
			// Optional:add in a slight delay.
		}

		System.out.println("I pledge allegiance to the flag.");

	}

	public static void first() {
		System.out.print("I                               \r");
	}

	public static void second() {
		System.out.print("  pledge                        \r");
	}

	public static void third() {
		System.out.print("         allegiance             \r");
	}

	public static void fourth() {
		System.out.print("                    to the      \r");
	}

	public static void fifth() {
		System.out.print("                           flag.\r");
	}
}
