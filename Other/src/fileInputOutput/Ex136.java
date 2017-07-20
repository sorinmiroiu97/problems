package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex136 {

	public static void main(String[] args) throws IOException {

		System.out.println("Which file to show?");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		sc.close();

		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);

		String line;
		while ((line = buff.readLine()) != null) {
			char[] c = line.toCharArray();
			for (int i = 2; i <= line.length(); i+=3) {
				System.out.print(c[i] + " ");
			}
		}
		
		buff.close();

	}

}
