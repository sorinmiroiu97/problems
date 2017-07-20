package arrays;

import java.util.Scanner;

public class Ex153 {

	public static void main(String[] args) {

		String[] words = { "animal", "arahnofobie", "ainsley", "laptop", "csharp", "shaorma" };
		String randomWord;
		char[] hiddenWord;
		
		Scanner sc = new Scanner(System.in);
		String guess;
		int tries = 0;
		char[] missed = new char[6];
		boolean foundChar = false, solved = false;

		randomWord = words[(int) (Math.random() * words.length)];
		hiddenWord = new char[randomWord.length()];
		for (int i = 0; i < randomWord.length(); i++) {
			hiddenWord[i] = '_';
		}

		while (tries < 5 && !solved) {
			System.out.println("You have " + (5 - tries) + " turns left.");
			System.out.print("Word:  ");
			for (int i = 0; i < randomWord.length(); i++) {
				System.out.print(hiddenWord[i] + " ");
			}
			System.out.println();
			System.out.println("Misses: ");
			for (int i = 0; i < missed.length; i++) {
				System.out.print(missed[i]);
			}

			System.out.println();
			System.out.println("Guess: ");
			guess = sc.next();
			foundChar = false;

			for (int i = 0; i < randomWord.length(); i++) {
				if (guess.charAt(0) == randomWord.charAt(i)) {
					hiddenWord[i] = randomWord.charAt(i);
					foundChar = true;
				}
			}
			if (!foundChar) {
				tries++;
				missed[tries] = guess.charAt(0);
			}

			int ok = 0;
			for (int i = 0; i < randomWord.length(); i++) {
				if ('_' == hiddenWord[i])
					ok++;
			}
			if (ok > 0)
				solved = false;
			else
				solved = true;
		}
		
		sc.close();

		System.out.println("You have " + (5 - tries) + " turns left.");
		System.out.print("Word:  ");
		for (int i = 0; i < randomWord.length(); i++) {
			System.out.print(hiddenWord[i] + " ");
		}
		System.out.println();
		System.out.println("Misses: ");
		for (int i = 0; i < missed.length; i++) {
			System.out.print(missed[i]);
		}

		if (solved)
			System.out.println("You did it!");
		else
			System.out.println("The word was: " + randomWord);

	}

}
