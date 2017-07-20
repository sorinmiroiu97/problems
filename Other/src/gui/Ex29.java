package gui;

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String input = JOptionPane.showInputDialog("How old r u?");
		
		int age = Integer.parseInt(input);
		
		System.out.print("Hello, " + name + ".");
		System.out.println("Next year, you'll be " + (age+1));
		
		System.exit(0);
		
	}

}
