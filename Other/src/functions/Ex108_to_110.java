package functions;

import java.util.Scanner;

public class Ex108_to_110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int keys = 0;
		int price = 10;
		
		int order = 5;
		int ship = 1;
		double tax = 8.25;
		
		do{
			System.out.println("1.Add keychains");
			System.out.println("2.Remove keychains");
			System.out.println("3.View order");
			System.out.println("4.Checkout");
			System.out.print("Type: ");
			
			x = sc.nextInt();
			
			switch(x){
			case 1:
				keys = add_keychains(keys);
				break;
			case 2:
				keys = remove_keychains(keys);
				break;
			case 3:
				view_order(keys, price, order, ship, tax);
				break;
			case 4:
				checkout(keys, price, order, ship, tax);
				break;
			default:
				System.out.println("ERROR...enter a valid option!");
				break;
			}
			
		}while(x!=4);
		
		sc.close();
		
	}
	
	
	public static int add_keychains(int keys){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You have " + keys);
		System.out.println("How many to add?");
		int add = sc.nextInt();
		keys = keys + add;
		System.out.println("You now have " + keys + " keychains.");
		return keys;
	}
	
	public static int remove_keychains(int keys){
		Scanner sc = new Scanner(System.in);
		System.out.println("You have " + keys);
		System.out.println("How many to Remove?");
		int sub = sc.nextInt();
		keys = keys - sub;
		System.out.println("You now have " + keys + " keychains.");
		
		return keys;
	}
	
	public static void view_order(int keys, int price, int order, int ship, double tax){
		System.out.println("You now have " + keys + " keychains.");
		System.out.println("The price for one is " + price);
		System.out.println("Shipping chargers (per order): " + order);
		System.out.println("The subtotal is " + (keys*price+order));
		System.out.println("The total is: " + ((keys*price+order+keys*ship)+(keys*price*tax)/100));
	}
	
	public static void checkout(int keys, int price, int order, int ship, double tax){
		Scanner sc = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = sc.next();
		view_order(keys, price, order, ship, tax);
		System.out.println("Thank you for the order " + name);
	}

}
