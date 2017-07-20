package functions;

import java.util.Scanner;

public class Ex104 {
	
	public static void main(String[] args) {
		
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.println("Insert option: ");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("base: ");
			int base = sc.nextInt();
			System.out.println("height: ");
			int height = sc.nextInt();
			System.out.println(area_triangle(base, height));
			break;

		case 2:
			System.out.println("lenght: ");
			int lenght = sc.nextInt();
			System.out.println("width: ");
			int width = sc.nextInt();
			System.out.println(area_rectangle(lenght, width));
			break;

		case 3:
			System.out.println("side: ");
			int side = sc.nextInt();
			System.out.println(area_square(side));
			break;

		case 4:
			System.out.println("radius");
			int radius = sc.nextInt();
			System.out.println(area_circle(radius));
			break;

		case 5:
			System.out.println("Buschetti maretti, un amore grande!");
			break;

		}

		sc.close();
		
	}

	public static double area_circle(int radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

	public static int area_rectangle(int length, int width) {
		return length * width;
	}

	public static int area_square(int side) {
		return (int) Math.pow(side, 2);
	}

	public static double area_triangle(int base, int height) {
		return (base * height) / 2.0;
	}

}
