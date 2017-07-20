package functions;

import java.util.Scanner;

public class Ex116 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for(int i=0; i<=10; i++){
			if(name.equals("Mitchel")){
				if(i==5)
					break;
				System.out.println(name);
			}
			else
				System.out.println(name);
		}
		
		sc.close();
		
	}

}
