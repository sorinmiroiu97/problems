package records;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Car {
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

public class Ex171 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Car[] car = new Car[5];

		for (int i = 0; i < car.length; i++) {
			
			car[i] = new Car();
			
			System.out.println("Car " + (i+1));
			
			System.out.print("Make: ");
			String make = sc.next();
			car[i].setMake(make);
			
			System.out.print("Model: ");
			String model = sc.next();
			car[i].setModel(model);
			
			System.out.print("Year: ");
			int year = sc.nextInt();
			car[i].setYear(year);
			
			System.out.print("License: ");
			String license = sc.next();
			car[i].setLicense(license);
			
		}
		
		System.out.println("To which file do you want to save this information? (.txt)");
		String path = sc.next();
		sc.close();
		
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter write = new PrintWriter(fileWriter);
		
		for (int i = 0; i < car.length; i++) {
			write.println(car[i].getMake() + " " + car[i].getModel() + " " + car[i].getYear() + " " + car[i].getLicense());
		}
		
		write.close();

	}

}
