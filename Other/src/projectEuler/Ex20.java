package projectEuler;

import java.math.BigInteger;

public class Ex20 {

	public static void main(String[] args) {
		
//		int fact = 1;
//		for(int i=100; i>0; i--) {
//			fact *= i;
//		}
//		
////		BigInteger factorial = new BigInteger(String.valueOf(fact));
//		String sum = "";
//		for (int i = 0; i < String.valueOf(fact).length(); i++) {
//			sum += String.valueOf(fact).charAt(i) - '0';
//		}
//        
//        System.out.println(Integer.valueOf(sum));
		
//		BigInteger sum = new BigInteger("0");
        BigInteger fac = new BigInteger("1");
         
        for (int i = 2; i <= 100; i++) {
//            fac *= i;
            fac = fac.multiply(new BigInteger(String.valueOf(i)));
        }
        
        String num = String.valueOf(fac);
        
        int sum = 0;
		for (int i = 0; i < num.length(); i++)
			sum += num.charAt(i) - '0';
		
//        while (fac.compareTo(new BigInteger("0")) > 1) {
//            sum = sum.add(fac.divide(new BigInteger("10")));
//            fac = fac.divide(new BigInteger("10"));
//        }
        
        System.out.println(sum);
	}

}
