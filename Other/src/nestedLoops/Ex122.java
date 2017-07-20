package nestedLoops;

public class Ex122 {

	public static void main(String[] args) {

		System.out.println(" x | \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
		System.out.println("===+==============================================================================================");
		
		for(int i=1; i<=12; i++){
			
			if(i<10)
				System.out.print(" " + i + " |\t");
			else
				System.out.print(i + " |\t");
			
			for(int j=1; j<=12; j++){
				System.out.print((i*j) + "\t");
			}
			System.out.println();
		}
		
	}

}
