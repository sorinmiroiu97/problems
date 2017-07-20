package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ex185 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

		int max = 0;

		for (int i = 0; i < 10; i++) {
			list.add(1 + rand.nextInt(50));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		for (Integer num : list) {
			if (num > max)
				max = num;
		}

		System.out.println("The max value is " + max);

	}

}
