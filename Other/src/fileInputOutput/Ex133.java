package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex133 {

	public static void main(String[] args) throws IOException {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Which file to show?");
		 String path = sc.nextLine();
		 sc.close();
		
		 File file = new File(path);
		
		 FileReader reader = new FileReader(file);
		 BufferedReader buffered = new BufferedReader(reader);
		
		 String line;
		 while((line=buffered.readLine()) != null){
			 System.out.println(line);
		 }
		 
		 buffered.close();

	}

}
