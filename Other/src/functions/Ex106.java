package functions;

public class Ex106 {

	public static void main( String[] args )
	{

		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = '!';
		System.out.println(randchar());
		System.out.println("The character is: " + c );

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(begin, end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x, y = 99;
		x = -10;
		System.out.println(abso(x));
		System.out.println("|" + x + "| = " + y );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}


	public static void credits(){

		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by [your name here]");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

	}




	public static char randchar(){
		
		int numval;
		char charval;

		numval = (int)(Math.random()*26);
		charval = (char) ('A' + numval);

		return charval;
	}



	public static void counter(int start, int stop){
		int ctr;

		ctr = start;
		while ( ctr <= stop )
		{
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}

	}


	public static int abso(int value){
		int absval;

		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}

}
