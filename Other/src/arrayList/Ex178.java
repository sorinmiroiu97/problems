package arrayList;

import java.util.ArrayList;

public class Ex178 {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>(10);

		for (int i = 0; i < 10; i++) {
			myList.add(new Integer(-113));
		}
		
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("Slot " + i + " contains: " + myList.get(i));
		}

	}

}
