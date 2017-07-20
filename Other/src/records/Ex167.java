package records;

import java.util.Scanner;

public class Ex167 {

	public static void main(String[] args) {

		Students[] stud = new Students[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first student's name: ");
		String stud1 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade1 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average1 = sc.nextDouble();

		stud[0] = new Students(stud1, grade1, average1);

		System.out.println("Enter the first student's name: ");
		String stud2 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade2 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average2 = sc.nextDouble();

		stud[1] = new Students(stud2, grade2, average2);

		System.out.println("Enter the first student's name: ");
		String stud3 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade3 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average3 = sc.nextDouble();

		stud[2] = new Students(stud3, grade3, average3);

		System.out.println(
				"The names are: " + stud[0].getName() + " " + stud[1].getName() + " " + stud[2].getName() + " ");
		System.out.println(
				"The grades are: " + stud[0].getGrade() + " " + stud[1].getGrade() + " " + stud[2].getGrade() + " ");
		System.out.println("The averages are: " + stud[0].getAverage() + " " + stud[1].getAverage() + " "
				+ stud[2].getAverage() + " ");

		sc.close();

	}

}
