package records;

import java.util.Scanner;

public class Ex168 {

	public static void main(String[] args) {

		Students[] stud = new Students[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the first student's name: ");
			String name = sc.next();
			System.out.println("Enter the first student's grade: ");
			int grade = sc.nextInt();
			System.out.println("Enter the first student's average: ");
			double average = sc.nextDouble();

			stud[i] = new Students(name, grade, average);
		}
		sc.close();

		System.out.print("The names are: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(stud[i].getName() + " ");
		}
		
		System.out.println();
		System.out.print("The grades are: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(stud[i].getGrade() + " ");
		}
		
		System.out.println();
		System.out.print("The averages are: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(stud[i].getAverage() + " ");
		}
		
	}

}
