package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex130 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What you write here will be written in the file then read from it and shown in console: ");
		String text = sc.nextLine();
		sc.close();
		
		File file = new File("name.txt");
		
		FileWriter fileWrite = new FileWriter(file);
		PrintWriter write = new PrintWriter(fileWrite);
		write.println(text);
		write.close();
		
		
		FileReader fileRead = new FileReader(file);
		BufferedReader buffRead = new BufferedReader(fileRead);
		
		String line;
		while((line = buffRead.readLine()) != null){
			String[] element = line.split(" ");
			for(String el : element){
				System.out.print(el + " ");
			}
		}
		
		buffRead.close();
		
	}

}
