package nestedLoops;

public class Ex126 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5000; i++){
			for(int j=0; j<=5000; j++){
				for(int k=0; k<=5000; k++){
					if(Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3) == i*100 + j*10 + k)
						System.out.println(i*100 + j*10 + k);
				}
			}
		}
		
		
	}

}
