package functions;

import java.util.Scanner;

public class Ex114 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		String op;

		do {
			System.out.print("> ");
			a = sc.nextDouble();
			op = sc.next();
			b = sc.nextDouble();

			if (op.equals("+"))
				c = a + b;
			else if (op.equals("*"))
				c = a * b;
			else if (op.equals("-"))
				c = a - b;
			else if (op.equals("/"))
				c = a / b;
			else {
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}
			
			System.out.println(c);

		} while(a!=0 && b!=0);
		
	}

}
