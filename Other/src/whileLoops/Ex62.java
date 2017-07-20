package whileLoops;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in your num");
		int n = sc.nextInt();
		sc.close();
		
		while(n!=1){
			if(n%2==0){
				n/=2;
				System.out.println(n);
			}
			else{
				n=3*n+1;
				System.out.println(n);
			}
		}
		
	}

}
