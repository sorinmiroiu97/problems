package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex132 {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 3 or more nums (separated by spaces): ");
		String text = sc.nextLine();
		System.out.println("Type in the new txt doc to be created and parsed: (with .txt)");
		String path = sc.nextLine();
		sc.close();
		
		//reads the nums from the user input
		//reads the new txt doc to be created, to store the nums into and to read from so you can see the sum
		//and the nums of the file
		
		
		File file = new File(path);
		
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
		System.out.println(" the sum: " + sum);
		
		buffRead.close();
		
	}

}
