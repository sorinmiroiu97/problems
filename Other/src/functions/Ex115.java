package functions;

import java.util.Scanner;

public class Ex115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a, b, op;

		double c = 0;

		do {
			System.out.print("> ");
			a = sc.next();
			op = sc.next();

			if (isNumeric(a)) {
				if (isInteger(a)) {

					b = sc.next();
					int B = Integer.parseInt(b);
					int A = Integer.parseInt(a);
					if (op.equals("+")) {
						c = B + A;

					} else if (op.equals("-")) {
						c = B - A;
					} else if (op.equals("*")) {
						c = B * A;
					} else if (op.equals("/")) {
						c = B / A + B % A;
					} else if (op.equals("^")) {
						c = Math.pow(B, A);
					} else {
						System.out.println("Undefined operator: '" + op + "'.");
						c = 0;
					}
				} else if (isDouble(a)) {

					b = sc.next();
					double B = Double.parseDouble(b);
					double A = Double.parseDouble(a);
					if (op.equals("+")) {
						c = B + A;

					} else if (op.equals("-")) {
						c = B - A;
					} else if (op.equals("*")) {
						c = B * A;
					} else if (op.equals("/")) {
						c = B / A + B % A;
					} else if (op.equals("^")) {
						c = Math.pow(B, A);
					} else {
						System.out.println("Undefined operator: '" + op + "'.");
						c = 0;
					}

				}
			} else {
				if (a.equals("sin")) {
					double OP = Double.parseDouble(op);
					c = Math.sin(OP);
				} else if (a.equals("cos")) {
					double OP = Double.parseDouble(op);
					c = Math.cos(OP);
				} else if (a.equals("tan")) {
					double OP = Double.parseDouble(op);
					c = Math.tan(OP);
				} else if (a.equals("sqrt")) {
					double OP = Double.parseDouble(op);
					c = Math.sqrt(OP);
				}
			}

			System.out.println(c);
		} while (true);
		// }while(a!=0&&b!=0);
		
	}

	public static boolean isNumeric(String s) {
		return (isDouble(s) || isInteger(s));
	}

	public static boolean isDouble(String s) {
		double n = 0;
		try {
			n = Double.valueOf(s);
		}

		catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static boolean isInteger(String s) {
		int n = 0;
		try {
			n = Integer.valueOf(s);
		}

		catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

}
