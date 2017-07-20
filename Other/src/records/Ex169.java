package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Dog {
	private String breed;
	private int age;
	private double weight;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

public class Ex169 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which file to open? (.txt)");
		String path = sc.next();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		Dog[] dog = new Dog[2];

		int i = 0;
		String line;
		while ((line = buff.readLine()) != null) {
			String[] element = line.split(",");
				dog[i] = createDog(element);
				i++;
		}

		buff.close();

		for (int j = 0; j < dog.length; j++) {
			if (j == 0) {
				System.out.println("First dog: " + dog[j].getBreed() + ", " + dog[j].getAge() + ", " + dog[j].getWeight());
			}
			if (j == 1) {
				System.out.println("Second dog: " + dog[j].getBreed() + ", " + dog[j].getAge() + ", " + dog[j].getWeight());
			}
		}

	}

	public static Dog createDog(String[] element) {

		Dog newDog = new Dog();
		newDog.setBreed(element[0]);
		newDog.setAge(Integer.valueOf(element[1]));
		newDog.setWeight(Double.valueOf(element[2]));

		return newDog;
	}

}
