package keyboardInput;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		sc.close();
		
		double s = (double) (a+b+c)/2;
		System.out.println("the result is: " + s);
		
	}
	
}
