package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Student {

	private int id;
	private int gradeNo;
	private double grade;
	private String letter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(int gradeNo) {
		this.gradeNo = gradeNo;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public void print(){
		System.out.println(this.id + " " + this.gradeNo + " " + this.grade + " "  + this.letter);
	}

}

public class Ex175 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which file to open? (.txt)");
		String path = sc.next();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		Student[] student = new Student[30];
		int num = 0;
		String line;

		while ((line = buff.readLine()) != null) {
			String[] element = line.split(" ");
			student[num] = createStudent(element);
			num++;
		}

		buff.close();

		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if(student[i].getId() > student[j].getId()){
					Student swap = student[i];
					student[i] = student[j];
					student[j] = swap;
				}
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if(student[i].getId() == student[j].getId() &&
						student[i].getGradeNo() > student[j].getGradeNo()){
					Student swap = student[i];
					student[i] = student[j];
					student[j] = swap;
				}
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}

	}

	public static Student createStudent(String[] element) {

		Student newStudent = new Student();
		newStudent.setId(Integer.valueOf(element[0]));
		newStudent.setGradeNo(Integer.valueOf(element[1]));
		newStudent.setGrade(Double.valueOf(element[2]));
		newStudent.setLetter(element[3]);

		return newStudent;
	}

}
