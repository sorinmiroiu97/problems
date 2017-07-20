package forLoops;

import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type in a num: ");
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=0; i<=n; i++){
			sum+=i;
		}
		System.out.println("the sum is: " + sum);
		
	}

}
