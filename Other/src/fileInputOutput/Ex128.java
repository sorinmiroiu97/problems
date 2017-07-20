package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex128 {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("letter.txt");
		PrintWriter write = new PrintWriter(file);
		
		write.println("+---------------------------------------------------------+");
		write.println("|                                                    #### |");
		write.println("|                                                    #### |");
		write.println("|                                                    #### |");
		write.println("|                                                         |");
		write.println("|                                                         |");
		write.println("|                              Sorin Miroiu               |");
		write.println("|                              Arad	                     |");
		write.println("|                                                         |");
		write.println("+---------------------------------------------------------+");
        
		write.close();
	}

}
