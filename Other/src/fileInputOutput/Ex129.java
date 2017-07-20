package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex129 {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("score.txt");
		PrintWriter write = new PrintWriter(file);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter a no: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("The data has been stored into score.txt");
		
		write.println(name);
		write.println(num);
		
		write.close();
	}

}
