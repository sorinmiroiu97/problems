package projectEuler;

public class Ex4 {

	public static void main(String[] args) {

		int max = 0;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				int prod = i * j;
				if (isPal(prod) && prod > max)
					max = prod;
			}
		}
		System.out.println(Integer.toString(max));

	}

	public static boolean isPal(int num) {
		int ogl =0 ;
	    while (num!=0){
	        ogl = ogl*10+num%10;
	        num=num/10;
	    }
	    if (ogl==num)
	    	return true;
	    else 
	    	return false;
	}

}
