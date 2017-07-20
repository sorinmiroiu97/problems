package ifStm;

public class Ex28 {
	
	public static void main(String[] args) throws Exception{
		
		for ( int i=0; i<80; i++ )
		{
			if ( i%16 == 0 )
				System.out.print(" Can                 \r");
			else if ( i%16 == 1 )
				System.out.print("   you               \r");
			else if ( i%16 == 2 )
				System.out.print("     read             \r");
			else if ( i%16 == 3 )
				System.out.print("       as           \r");
			else if ( i%16 == 4 )
				System.out.print("         fast         \r");
			else if ( i%16 == 5 )
				System.out.print("           as       \r");
			else if ( i%16 == 6 )
				System.out.print("             this     \r");
			else if ( i%16 == 7 )
				System.out.print("               ?   \r");
			else if ( i%16 == 8 )
				System.out.print("                 If \r");
			else if ( i%16 == 9 )
				System.out.print("               yes,   \r");
			else if ( i%16 == 10 )
				System.out.print("             cool    \r");
			else if ( i%16 == 11 )
				System.out.print("          else...       \r");
			else if ( i%16 == 12 )
				System.out.print("        not        \r");
			else if ( i%16 == 13 )
				System.out.print("       so           \r");
			else if ( i%16 == 14 )
				System.out.print("     cool             \r");
			else if ( i%16 == 15 )
				System.out.print("   nigga!               \r");

			Thread.sleep(200);
		}		
	}
	
}
