package arrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex190 {

	public static void main(String[] args) throws Exception {

		ArrayList<Car> list = new ArrayList<Car>();
		System.out.println("From which file do you want to load this information? ");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		Car[] car = new Car[5];

		int i = 0;
		String line;
		while ((line = buff.readLine()) != null) {
			String[] element = line.split(" ");
			car[i] = createCar(element);
			list.add(car[i]);
			i++;
		}
		buff.close();

		System.out.println("\nThe list: ");

		for (int j = 0; j < list.size(); j++) {
			car[j].print();
		}
		
		sortList(list, car);

		System.out.println("\nSorted list: ");

		for(Car obj : list) {
			obj.print();
		}

	}

	public static Car createCar(String[] element) {

		Car newCar = new Car();
		newCar.setMake(element[0]);
		newCar.setModel(element[1]);
		newCar.setYear(Integer.valueOf(element[2]));
		newCar.setLicense(element[3]);

		return newCar;
	}

	public static void sortList(ArrayList<Car> list, Car[] car) {
		Car swap;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getYear() > list.get(j).getYear()) {
					swap = list.get(i);
					list.set(i, list.get(j));
					list.set(j, swap);
				}
			}
		}
	}

}
