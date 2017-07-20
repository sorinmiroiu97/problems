package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex137 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which file to open? (ex: vowels.txt)");
		String path = sc.nextLine();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		String line;
		while ((line = buff.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					System.out.print(Character.toUpperCase(c));
				} else
					System.out.print(c);
			}
			System.out.println();
		}

		buff.close();
	}

}
