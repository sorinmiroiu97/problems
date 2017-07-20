package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ex179 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(1 + rand.nextInt(100));
		}
		
		System.out.print("ArrayList: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
