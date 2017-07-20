package sorting;

import java.util.Scanner;

public class Ex158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

		String swap;
		int a;
		int b;

		do {
			System.out.println("EXCHANGE POKEMON\n");
			for (int i = 0; i < pokeParty.length; i++)
				System.out.println("    " + i + ". " + pokeParty[i]);

			System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
			a = sc.nextInt();

			if (a >= 0) {
				System.out.print("Choose a Pokemon to exchange with " + pokeParty[a] + ". => ");
				b = sc.nextInt();

				System.out.println("\nExchanging " + pokeParty[a] + " with " + pokeParty[b] + ".\n");

				// add code here to swap the Pokemon in slot a with the Pokemon
				// in slot b
				swap = pokeParty[a];
				pokeParty[a] = pokeParty[b];
				pokeParty[b] = swap;
			}

		} while (a >= 0);

		sc.close();

	}

}
