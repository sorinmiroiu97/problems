package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex189 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		sc.close();

		sentence = sentence.toLowerCase();
		
		String[] word = sentence.split(" ");

		for (int i = 0; i < word.length; i++) {
			list.add(word[i]);
		}

		System.out.println("\nThe list: " + list.toString());

		sortList(list);

		System.out.println("\nSorted list: " + list.toString());
	}

	public static void sortList(ArrayList<String> list) {
		String swap;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) < 0) {
					swap = list.get(i);
					list.set(i, list.get(j));
					list.set(j, swap);
				}
			}
		}
	}

}
