package whileLoops;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int roomNum = 1;
			String option = "";

			while ( roomNum != 0 )
			{
				if ( roomNum == 1 )
				{
					System.out.println( "You are in a small room. There is a \"closet\" and a doorway to the \"hall\"." );
					System.out.print( "> " );
					option = sc.nextLine();
					if ( option.equals("closet") )
						roomNum = 2;
					else if ( option.equals("hall") )
						roomNum = 3;
					else
						System.out.println( option + " wasn't one of the options. Try again." );
				}
				if ( roomNum == 2 )
				{
					System.out.println( "You're in a barren closet. There's nothing to do here except go \"back\"." );
					System.out.print( "> " );
					option = sc.nextLine();
					if ( option.equals("back") )
						roomNum = 1;
					else
						System.out.println( option + " wasn't one of the options. Try again." );
				}
				if ( roomNum == 3 )
				{
					System.out.println( "You find yourself in a concrete hallway. Oddly, there is only a single" );
					System.out.println( "\"door\" visible. Otherwise, the hall just extends about fifteen feet" );
					System.out.println( "in either direction, and ends in a smooth, blank, concrete wall." );
					System.out.println( "Do you want to enter the \"door\" or approach the \"wall\" looking for clues?" );
					option = sc.nextLine();
					System.out.print( "> " );
					if ( option.equals("door") )
						roomNum = 1;
					else if ( option.equals("wall") )
						roomNum = 4;
					else
						System.out.println( option + " wasn't one of the options. Try again." );
				}
				if ( roomNum == 4 )
				{
					System.out.println( "Upon closer inspection, the seemingly blank wall shimmers ever so slightly" );
					System.out.println( "in the dim light. You put forward a tentative hand, and it pushes through," );
					System.out.println( "a feeling of static sliding up your arm." );
					System.out.println();
					System.out.println( "You pass through the portal into the unknown...." );
					roomNum = 0;
				}
					
			}
			
			sc.close();

			System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );
		
	}

}
