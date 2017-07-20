package randomNums;

import java.util.Random;

public class Ex44 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int rand = 1 + r.nextInt(10);
		
		if(rand == 1)
			System.out.println("stai bine cu sanatatea, dar ai grija si tine bine de bani");
		else if(rand == 2)
			System.out.println("stai bine cu sanatatea, dar ai grija la tine");
		else if(rand == 3)
			System.out.println("stai bine cu sanatatea, dar ai grija la bani");
		else if(rand == 4)
			System.out.println("nu prea stai bine cu sanatatea, dar macar tine bine de bani");
		else if(rand == 5)
			System.out.println("nu prea stai bine cu sanatatea, dar nici bani nu ai");
		else System.out.println("nu stai bine nici cu sanatatea nici cu banii");
		 System.out.println(1+r.nextInt(25) + " " +  1+r.nextInt(25) + " " + 1+r.nextInt(25)+ " " + 1+r.nextInt(25)+ " " + 1+r.nextInt(25));
			
	}

}
