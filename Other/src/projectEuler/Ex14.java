package projectEuler;

public class Ex14 {
	
	private static final int number = 1000000;

	public static void main(String[] args) {
		
		long seqLenght = 0;
		long startNum = 0;
		long seq;
		 
		for (int i = 2; i <= number; i++) {
		    int length = 1;
		    seq = i;
		    while (seq != 1) {
		        if ((seq % 2) == 0) {
		            seq = seq / 2;
		        } else {
		            seq = seq * 3 + 1;
		        }
		        length++;
		    }
		 
		    if (length > seqLenght) {
		        seqLenght = length;
		        startNum = i;
		    }
		}
		System.out.println(startNum);
		
	}

}
