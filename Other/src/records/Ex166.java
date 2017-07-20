package records;

import java.util.Scanner;

class Students {
	private String name;
	private int grade;
	private double average;

	public Students(String name, int grade, double average) {
		this.name = name;
		this.grade = grade;
		this.average = average;
	}

	public void print() {
		System.out.println(this.name + " " + this.grade + " " + this.average);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getGrade(){
		return this.grade;
	}
	
	public double getAverage() {
		return this.average;
	}
	
}

public class Ex166 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first student's name: ");
		String stud1 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade1 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average1 = sc.nextDouble();

		Students st1 = new Students(stud1, grade1, average1);

		System.out.println("Enter the first student's name: ");
		String stud2 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade2 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average2 = sc.nextDouble();

		Students st2 = new Students(stud2, grade2, average2);

		System.out.println("Enter the first student's name: ");
		String stud3 = sc.next();
		System.out.println("Enter the first student's grade: ");
		int grade3 = sc.nextInt();
		System.out.println("Enter the first student's average: ");
		double average3 = sc.nextDouble();

		Students st3 = new Students(stud3, grade3, average3);

		sc.close();

		System.out.println("The average for the three students is: "
				+ (st1.getAverage() + st2.getAverage() + st3.getAverage()) / 3);
	}

}
