package records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class CarDemo {
	private String make;
	private String model;
	private int year;
	private String license;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
}

public class Ex172_174 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which file to open? (.txt)");
		String path = sc.next();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		CarDemo[] car = new CarDemo[5];

		int i = 0;
		String line;
		while ((line = buff.readLine()) != null) {
			String[] element = line.split(" ");
			car[i] = createCar(element);
			i++;
		}

		buff.close();

		// the sort by years - this is for Ex173
		for (int j = 0; j < car.length; j++) {
			for (int k = j + 1; k < car.length; k++) {
				if (car[j].getYear() > car[k].getYear()) {
					CarDemo swap = car[j];
					car[j] = car[k];
					car[k] = swap;
				}
			}
		}

		System.out.println("sorted by years");
		for (int j = 0; j < car.length; j++) {
			System.out.println("Car " + (j + 1));
			System.out.println(
					car[j].getMake() + ", " + car[j].getModel() + ", " + car[j].getYear() + ", " + car[j].getLicense());
		}

		// the sort by make - this is for Ex174
		for (int j = 0; j < car.length; j++) {
			for (int k = j + 1; k < car.length; k++) {
				int val = car[j].getMake().compareTo(car[k].getMake());
				if (val > 0) {
					CarDemo swap = car[j];
					car[j] = car[k];
					car[k] = swap;
				}
			}
		}

		System.out.println("sorted by make");
		for (int j = 0; j < car.length; j++) {
			System.out.println("Car " + (j + 1));
			System.out.println(
					car[j].getMake() + ", " + car[j].getModel() + ", " + car[j].getYear() + ", " + car[j].getLicense());
		}

	}

	public static CarDemo createCar(String[] element) {

		CarDemo newCar = new CarDemo();
		newCar.setMake(element[0]);
		newCar.setModel(element[1]);
		newCar.setYear(Integer.valueOf(element[2]));
		newCar.setLicense(element[3]);

		return newCar;
	}

}
