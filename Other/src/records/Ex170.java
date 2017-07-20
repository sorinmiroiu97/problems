package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Ex170 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which file to open? (.txt)");
		String path = sc.next();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		Person[] person = new Person[5];
		
		int i = 0;
		String line;
		while ((line = buff.readLine()) != null) {
			String[] element = line.split(",");
			person[i] = createPerson(element);
			i++;
		}

		buff.close();
		
		for (int j = 0; j < person.length; j++) {
			System.out.println(person[j].getName() + " is " + person[j].getAge());
		}
		
	}
	
	public static Person createPerson(String[] element) {

		Person newPerson = new Person();
		newPerson.setName(element[0]);
		newPerson.setAge(Integer.valueOf(element[1]));

		return newPerson;
	}

}
