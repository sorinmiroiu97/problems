package book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<AddressBook> list = new ArrayList<AddressBook>();
		Scanner sc = new Scanner(System.in);
		
//		String path = sc.next();
//
//		File file = new File(path);
//		FileReader reader = new FileReader(file);
//		BufferedReader buff = new BufferedReader(reader);
//
//		FileWriter fileWrite = new FileWriter(file);
//		PrintWriter write = new PrintWriter(fileWrite);
//
//		int capacity = 100;
//		AddressBook[] book = new AddressBook[capacity];
//
//		int i = 0;
//		String line;
//		while ((line = buff.readLine()) != null) {
//			String[] element = line.split(" ");
//			book[i] = createCar(element);
//			list.add(book[i]);
//			i++;
//		}
//		buff.close();
		
		menu();
		int option = 0;
		do {
			option = sc.nextInt();
			switch (option) {
			case 1:
				loadFile(list);
				menu();
				break;
			case 2:
				saveFile(list);
				menu();
				break;
			case 3:
				addEntry(list);
				menu();
				break;
			case 4:
				removeEntry(list);
				menu();
				break;
			case 5:
				printBook(list);
				menu();
				break;
			case 6:
				sortList(list);
				menu();
				break;
			case 7:
				searchForEntry(list);
				menu();
				break;
			case 8:
				editEntry(list);
				break;
			case 9:
				System.exit(0);
				break;
			}

		}while (option!=9);

//		 sc.close();

	}
	
	public static void editEntry(ArrayList<AddressBook> list) {
		Scanner sc = new Scanner(System.in);
		printBook(list);
		System.out.println("Which entry do u want to edit? ");
		int entry = sc.nextInt();
		
		System.out.println("First name: ");
		String first = sc.next();
		System.out.println("Last name: ");
		String last = sc.next();
		System.out.println("Phone no: ");
		int phone = sc.nextInt();
		System.out.println("Address name: ");
		String address = sc.next();
		System.out.println("Email : ");
		String email = sc.next();
		AddressBook dummyBook = new AddressBook(first, last, phone, address, email);
		
		list.set(entry-1, dummyBook);
	}
	
	public static void saveFile(ArrayList<AddressBook> list) throws Exception {
		
		System.out.println("Save to which file? ");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		File file = new File(path);
		FileWriter fileWrite = new FileWriter(file);
		PrintWriter write = new PrintWriter(fileWrite);
		
		for(AddressBook obj : list) {
			write.println((obj.getLast() + " " + obj.getFirst() + " " + obj.getPhone() + " " + obj.getAddress() + " " + obj.getEmail()) + "");
		}
		
		write.close();
	}
	
	public static void searchForEntry(ArrayList<AddressBook> list) {
		Scanner sc = new Scanner(System.in);
		printBook(list);
		System.out.println("Which entry do u search for? ");
		int entry = sc.nextInt();
		list.get(entry-1).print();
	}
	
	public static void removeEntry(ArrayList<AddressBook> list) {
		Scanner sc = new Scanner(System.in);
		printBook(list);
		System.out.println("Which entry do u want to remove? ");
		int entry = sc.nextInt();
		list.remove(entry);
	}
	
	public static void addEntry(ArrayList<AddressBook> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First name: ");
		String first = sc.next();
		System.out.println("Last name: ");
		String last = sc.next();
		System.out.println("Phone no: ");
		int phone = sc.nextInt();
		System.out.println("Address name: ");
		String address = sc.next();
		System.out.println("Email : ");
		String email = sc.next();
		AddressBook obj = new AddressBook(first, last, phone, address, email);
		list.add(obj);
		
	}
	
	public static void loadFile(ArrayList<AddressBook> list) throws Exception {
		
		list = new ArrayList<AddressBook>();
		System.out.println("From which file do you want to load this information? ");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);
		
		

		int capacity = 100;
		AddressBook[] book = new AddressBook[capacity];

		int i = 0;
		String line;
		while ((line = buff.readLine()) != null) {
			String[] element = line.split(" ");
			book[i] = createBook(element);
			list.add(book[i]);
			i++;
		}
	}

	public static AddressBook createBook(String[] element) {

		AddressBook newBook = new AddressBook(element[0], element[1], Integer.valueOf(element[2]), element[3], element[4]);
		return newBook;
	}

	public static void sortList(ArrayList<AddressBook> list) {
		AddressBook swap;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getLast().compareTo(list.get(j).getLast()) > 0) {
					swap = list.get(i);
					list.set(i, list.get(j));
					list.set(j, swap);
				}
			}
		}
	}
	
	public static void printBook(ArrayList<AddressBook> list) {
		for(AddressBook obj : list) {
			System.out.println(obj.getLast() + " " + obj.getFirst() + " " + obj.getPhone() + " " + obj.getAddress() + " " + obj.getEmail());
		}
	}
	
	public static void menu() {
		System.out.println("1) Load from file");
		System.out.println("2) Save to file");
		System.out.println("3) Add an entry");
		System.out.println("4) Remove an entry");
		System.out.println("5) Print the address book");
		System.out.println("6) Sort the address book");
		System.out.println("7) Search for a specific entry");
		System.out.println("8) Edit an entry");
		System.out.println("9) Quit");
	}

}
