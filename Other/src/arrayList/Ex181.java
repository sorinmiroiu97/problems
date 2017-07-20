package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ex181 {

	public static void main(String[] args) {
		
		Random rand = new Random();

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list1.add(1 + rand.nextInt(100));
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
		
		list1.set(list1.size() -1, -7);
		
		System.out.print("ArrayList1: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		System.out.print("ArrayList2: ");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
	}

}
