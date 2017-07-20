package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex131 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 3 nums (separated by spaces): ");
		String text = sc.nextLine();
		sc.close();
		
		File file = new File("3nums.txt");
		
		FileWriter fileWrite = new FileWriter(file);
		PrintWriter write = new PrintWriter(fileWrite);
		write.println(text);
		write.close();
		
		
		FileReader fileRead = new FileReader(file);
		BufferedReader buffRead = new BufferedReader(fileRead);
		
		int sum = 0;
		String line;
		while((line = buffRead.readLine()) != null){
			String[] element = line.split(" ");
			for(String el : element){
				System.out.print(el + " ");
				sum = sum + Integer.valueOf(el);
			}
		}
		System.out.println(sum);
		
		buffRead.close();
		
	}

}
