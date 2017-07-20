package whileLoops;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		do{
			a = sc.nextInt();
			
			b = sc.nextInt();
			if(b<a){
				System.out.println("retype b: ");
				b= sc.nextInt();
			}
			
			c = sc.nextInt();
			if(c<b){
				System.out.println("retype c: ");
				c = sc.nextInt();
			}
		}while(a <= b && b <= c && a <= c);
		
		sc.close();
		
		if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a)
			System.out.println(a + " " + b + " " + c + " " + "make a right triangle. Yippy-skippy!");
		else System.out.println("NO! These sides do not make a right triangle!");
		
		
	}

}
