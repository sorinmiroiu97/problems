package keyboardInput;

import java.util.Scanner;

public class Ex17 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String fName = sc.next();
		String lName = sc.next();
		int grade = sc.nextInt();
		int studentId = sc.nextInt();
		String login = sc.next();
		double gpa = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Your info: ");
		System.out.println("Login: " + login);
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + fName + " " +lName);
		System.out.println("GPA: " + gpa);
		System.out.println("Grade: " + grade);
		
	}
}
