package projectEuler;

public class E17 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += intoString(i).length();
		System.out.println(sum);

	}

	private static String intoString(int n) {
		if (0 <= n && n < 20)
			return ONES[n];
		else if (20 <= n && n < 100)
			return TENS[n / 10] + (n % 10 != 0 ? ONES[n % 10] : "");
		else if (100 <= n && n < 1000)
			return ONES[n / 100] + "hundred" + (n % 100 != 0 ? "and" + intoString(n % 100) : "");
		else if (1000 <= n && n < 1000000)
			return intoString(n / 1000) + "thousand" + (n % 1000 != 0 ? intoString(n % 1000) : "");
		else
			throw new IllegalArgumentException();
	}

	private static String[] ONES = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static String[] TENS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

}
