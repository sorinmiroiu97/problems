package whileLoops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex63b {

	public static void main(String[] args) throws InputMismatchException {
		
		try{
		Scanner sc = new Scanner(System.in);
		int a=3, b=3, c=3;
		
		while(a>0 || b>0 || c>0){
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
		}
		
		System.out.println("a: " + a + "  b: " + b + "  c: " + c);
		
		sc.close();
		}catch(InputMismatchException e){
			e.printStackTrace();
		}

	}

}
