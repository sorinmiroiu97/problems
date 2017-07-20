package nestedLoops;

import java.util.Scanner;

public class Ex125 {

	public static void main(String[] args) {

		int option;

		while (true) {
			option = menu();

			if (option == 1)
				option1();
			else if (option == 2)
				option2();
			else if (option == 3)
				break;
			else
				System.out.println("Invalid option. Please try again.");
		}

	}

	public static void option1() {
		for (int i = 10; i < 57; i++) {
			if ((i / 10) + (i % 10) > 10)
				System.out.println(i + " " + (i / 10) + "+" + (i % 10) + " = " + ((i / 10) + (i % 10)));
		}
	}

	public static void option2() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (((i * 10) + j) - ((j * 10) + (i)) == ((i) + j))
					System.out.println((i * 10) + j);
			}
		}

		// int ogl = 0;
		// int s = 0;
		// int uc = 0;
		// for (int i = 10; i <= 99; i++) {
		// int n = i;
		// while(i>0){
		// uc = n % 10;
		// ogl = ogl * 10 + uc;
		// s = s + uc;
		// n /= 10;
		// }
		// if(i - ogl == s)
		// System.out.println(n);
		// }
	}

	public static int menu() {
		Scanner kb = new Scanner(System.in);
		int option;

		System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
		System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
		System.out.println("3) Quit");
		System.out.print("\n> ");
		option = kb.nextInt();

		return option;
	}

}
