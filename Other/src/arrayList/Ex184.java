package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex184 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(1 + rand.nextInt(50));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("Value to find: ");
		int val = sc.nextInt();
		sc.close();
		boolean ok = false;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == val){
				System.out.println(val + " is in the arraylist at index " + i);
				ok = true;
			}
		}
		if (!ok)
			System.out.println(val + " is not in the list");

	}

}
