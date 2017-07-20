package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ex180 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			list.add(10 + rand.nextInt(99));
		}

		System.out.print("ArrayList: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i % 20 == 0)
				System.out.println();
		}

	}

}
