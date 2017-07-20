package whileLoops;

import java.util.Scanner;

public class Ex63c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=3, b=3, c=3;
		
		System.out.println("P1: ");
		String p1 = sc.next();
		System.out.println("P2: ");
		String p2 = sc.next();
		
		int turn=0;
		
		while(a>0 || b>0 || c>0){
			if(turn%2==0)
				System.out.println(p1 + " it's your turn");
			else
				
				System.out.println(p2 + " it's your turn");
			System.out.println("a: " + a + "  b: " + b + "  c: " + c);
			System.out.println("choose a pile (a/b/c) ");
			String str = sc.next();
			System.out.println("how many to remove from pile ?");
			int count = sc.nextInt();
			
			if(str.equals("a")){
				a-=count;
			}
			else if(str.equals("b")){
				b-=count;
			}
			else if(str.equals("c")){
				c-=count;
			}
			turn++;
		}
		
		System.out.println("a: " + a + "  b: " + b + "  c: " + c);
		
		sc.close();
		
	}

}
