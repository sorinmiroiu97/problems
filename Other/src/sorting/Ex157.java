package sorting;

import java.util.Scanner;

public class Ex157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		String swap;
		
		int x;

		do {
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("0. " + pokeParty[0]);
			for (int i = 1; i < pokeParty.length; i++)
				System.out.println(i + ". " + pokeParty[i]);

			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = sc.nextInt();

			// add code here to swap the Pokemon in slot 0 with the Pokemon in
			// slot x
			swap = pokeParty[0];
			pokeParty[0] = pokeParty[x];
			pokeParty[x] = swap;

		} while (x > 0);
		
		sc.close();

	}

}
