package functions;

import java.util.Scanner;

public class Ex111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
		System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
		System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
		System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
		System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
		System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		int yyyy = sc.nextInt();
		sc.close();
		
		System.out.println("You were born on " + weekday(mm,dd,yyyy));
	}

	public static String weekday(int mm, int dd, int yyyy) {
		int yy, total;
		String date = "";

		yy = yyyy - 1900;

		if (Ex103.is_leap(yyyy) == true && mm == 1 || mm == 2)
			total = yy / 4 + yy + dd + Ex102.month_offset(mm) - 1;
		else
			total = yy / 4 + yy + dd + Ex102.month_offset(mm);

		date = Ex103.weekday_name(total % 7) + ", " + Ex101.month_name(mm) + " " + dd + ", " + yyyy;
		return date;
	}

}
