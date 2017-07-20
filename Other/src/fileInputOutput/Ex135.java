package fileInputOutput;

import java.net.URL;
import java.util.Scanner;

public class Ex135 {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://cs.leanderisd.org/mitchellis.txt");
		Scanner sc = new Scanner(url.openStream());

//		String line;
//		while((line = sc.nextLine()) != null){
//			System.out.println(line);
//		}

		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();

	}

}
