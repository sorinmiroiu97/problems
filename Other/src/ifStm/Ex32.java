package ifStm;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		String obj = sc.nextLine();
		System.out.println("Question 2) Is it bigger than a breadbox?(yes/no)");
		String ans = sc.nextLine();
		sc.close();
		
		if(ans.equals("yes")){
			if(obj.equals("animal")){
				System.out.println("My guess is that you are thinking of a lion."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
			else if(obj.equals("vegetable")){
				System.out.println("My guess is that you are thinking of a watermelon."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
			else if(obj.equals("mineral")){
				System.out.println("My guess is that you are thinking of Wolfenstein."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
		}
		else if(ans.equals("no")){
			if(obj.equals("animal")){
				System.out.println("My guess is that you are thinking of a mouse."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
			else if(obj.equals("vegetable")){
				System.out.println("My guess is that you are thinking of a carrot."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
			else if(obj.equals("mineral")){
				System.out.println("My guess is that you are thinking of a paper clip."
						+ " I would ask you if I'm right, but I don't actually care.");
			}
		}
	}

}
