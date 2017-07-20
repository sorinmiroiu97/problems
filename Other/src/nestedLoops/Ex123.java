package nestedLoops;

public class Ex123 {

	public static void main(String[] args) {

//		for (int i = 10; i < 100; i++) {
//			if ((i % 10) + (i / 10) == 60)
//				System.out.println(i);
//			if (i / 10 - i % 10 == 14)
//				System.out.println(i);
//		}
//
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 0; j <= 9; j++) {
//				if (i + j == 60)
//					System.out.println(i + "" + j);
//				if (i - j == 14)
//					System.out.println(i + "" + j);
//			}
//		}
		//numere nu cifre duuh....stiam...
		
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((i + j) == 60 && (i - j) == 14)
					System.out.println("(" + i + ", " + j + ") --> verifica ambele cazuri");
				if ((i + j) == 60)
					System.out.println("(" + i + ", " + j + ") --> verifica doar suma");
				if((i - j) == 14)
					System.out.println("(" + i + ", " + j + ") --> verifica doar dif");
			}
		}

	}

}
