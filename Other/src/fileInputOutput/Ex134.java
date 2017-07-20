package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex134 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Which file to show?");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		sc.close();
		
		File file = new File(path);
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);
		
		int sum = 0;
		String line;
		while((line = buff.readLine()) != null){
			String[] element = line.split(" ");
			for(String el : element){
				System.out.print(el + " ");
				sum = sum + Integer.valueOf(el);
			}
		}
		
		buff.close();
		System.out.println("Sum: " + sum);
		
	}

}
