package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ex187 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(10 + rand.nextInt(89));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		sortList(list);

		System.out.println("\nSorted list: " + list.toString());

	}

	public static void sortList(ArrayList<Integer> list) {
		int swap;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					swap = list.get(i);
					list.set(i, list.get(j));
					list.set(j, swap);
				}
			}
		}
	}

}
