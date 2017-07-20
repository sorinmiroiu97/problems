package functions;

import java.util.Scanner;

public class Ex117 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		
		int end = 10;
		
		if(name.equals("Mitchel"))
			end = 5;
		
		for(int i=1; i<=end; i++){
			System.out.println(name);
		}
		
	}

}
