package ifStm;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your current earth weight: ");
		
		int weight = sc.nextInt();
		
		System.out.println("I have information for the following planets:"
   + "1. Venus   2. Mars    3. Jupiter 4. Saturn  5. Uranus  6. Neptune"
+ "Which planet are you visiting?");
		
		int planet = sc.nextInt();
		
		sc.close();
		
		if(planet == 1){
			System.out.println(weight*0.78);
		}
		else if(planet == 2){
			System.out.println(weight*0.39);
		}
		else if(planet == 3){
			System.out.println(weight*2.65);
		}
		else if(planet == 4){
			System.out.println(weight*1.17);
		}
		else if(planet == 5){
			System.out.println(weight*1.05);
		}
		else if(planet == 6){
			System.out.println(weight*1.23);
		}
		
	}
	
}
