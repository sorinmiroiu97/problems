package arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex143 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type the first name");
		String first = sc.nextLine();
		System.out.println("type the last name");
		String last = sc.nextLine();
		System.out.println("type the file name");
		String path = sc.nextLine();
		sc.close();
		
		File file = new File(path);
		FileWriter fileWrite = new FileWriter(file);
		PrintWriter write = new PrintWriter(fileWrite);
		write.println(first);
		write.println(last);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = 1+ (int) (Math.random() * 100);
			write.println("your grades: " + arr[i]);
		}
		
		write.close();
		
	}

}
