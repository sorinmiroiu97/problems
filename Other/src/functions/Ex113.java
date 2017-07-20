package functions;

public class Ex113 {

	public static void main(String[] args) {
		
		for(int i=2; i<=20; i++){
			if(isPrime(i))
				System.out.println(i + "<");
			else
				System.out.println(i);
		}
		
	}
	
	public static boolean isPrime(int n) {
		
		int ok = 0;
		for(int d=1; d<=n; d++){
			if(n%d==0)
				ok++;
		}
		if(ok==2)
			return true;
		else
			return false;
		
	}

}
