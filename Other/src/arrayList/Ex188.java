package arrayList;

import java.util.ArrayList;

public class Ex188 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("ask");
		list.add("not");
		list.add("what");
		list.add("your");
		list.add("country");
		list.add("can");
		list.add("do");
		list.add("for");
		list.add("you");
		list.add("but");
		
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
