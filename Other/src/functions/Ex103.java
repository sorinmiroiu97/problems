package functions;

import java.util.Scanner;

public class Ex103 {

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

		if (is_leap(yyyy) == true && mm == 1 || mm == 2)
			total = yy / 4 + yy + dd + month_offset(mm) - 1;
		else
			total = yy / 4 + yy + dd + month_offset(mm);

		date = weekday_name(total % 7) + ", " + month_name(mm) + " " + dd + ", " + yyyy;
		return date;
	}

	
	public static String weekday_name(int day) {
		String result;

		if (day == 1)
			result = "Monday";
		else if (day == 2)
			result = "Tuesday";
		else if (day == 3)
			result = "Wednesday";
		else if (day == 4)
			result = "Thursday";
		else if (day == 5)
			result = "Friday";
		else if (day == 6)
			result = "Saturday";
		else if (day == 0)
			result = "Sunday";
		else
			result = "Error";

		return result;
	}
	
	public static String month_name(int num) {

		String month = "";

		if (num == 1)
			month = "January";
		else if (num == 2)
			month = "Febrary";
		else if (num == 3)
			month = "March";
		else if (num == 4)
			month = "April";
		else if (num == 5)
			month = "May";
		else if (num == 6)
			month = "June";
		else if (num == 7)
			month = "July";
		else if (num == 8)
			month = "August";
		else if (num == 9)
			month = "September";
		else if (num == 10)
			month = "October";
		else if (num == 11)
			month = "November";
		else if (num == 12)
			month = "December";
		else
			month = "Error";

		return month;
	}

	public static int month_offset(int month) {
		int result = 0;

		if (month == 1)
			result = 1;
		else if (month == 2)
			result = 4;
		else if (month == 3)
			result = 4;
		else if (month == 4)
			result = 0;
		else if (month == 5)
			result = 2;
		else if (month == 6)
			result = 5;
		else if (month == 7)
			result = 0;
		else if (month == 8)
			result = 3;
		else if (month == 9)
			result = 6;
		else if (month == 10)
			result = 1;
		else if (month == 11)
			result = 4;
		else if (month == 12)
			result = 6;
		else
			result = -1;

		return result;
	}

	public static boolean is_leap(int year) {
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if (year % 400 == 0)
			result = true;
		else if (year % 100 == 0)
			result = false;
		else if (year % 4 == 0)
			result = true;
		else
			result = false;

		return result;
	}

}
