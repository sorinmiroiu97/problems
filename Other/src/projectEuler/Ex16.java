package projectEuler;

import java.math.BigInteger;

public class Ex16 {

	public static void main(String[] args) {
		
		BigInteger num = new BigInteger("2").pow(1000);
		BigInteger sum = BigInteger.ZERO;
	    while (num.compareTo(BigInteger.ZERO) == 1) {
	        sum = sum.add(num.remainder(new BigInteger("10")));
	        num = num.divide(new BigInteger("10"));
	    }
		System.out.println(sum);
	}

}
