package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and
	 * the classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are
	 * also free to add any additional methods or classes in Console Store that
	 * might be helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can
	 * be food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should
	 * have its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove
	 * items, view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have
	 * enough money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the
	 * amount from their stipend, show them the pictures of what they bought and
	 * print out a receipt showing their name, the individual prices of the
	 * items and their total.
	 */

	public static void main(String[] args) {
		//NOTE: don't initialize money and price here unless you're testing stuff like checkout
		int money = 25;
		int price = 55;
		boolean purchased = false;
		boolean inCheckOut = false;
		boolean checkOutReturn = false;
		Scanner scan = new Scanner(System.in);
		ConsoleCart cart = new ConsoleCart<ConsoleItem>();

		System.out.println("Hello shopper! What is your name?");
		String name = scan.nextLine();
		System.out.println("Welcome to the store, " + name + "!");

		do {
			//store main interface thingy
			System.out.println("What can I help you with? (add/remove/view/check out)");
			String help = scan.nextLine();
			switch (help) {
			case "add":
				System.out.println("You go to the shelves to put something in your cart. What do you add?");
				
				String add = scan.nextLine();
				
				//what will you add (NOTE: fix the error later)
				switch (add) {
				case "cat":
					System.out.println("You pick a cat off the shelves.");
					//cart.add(Cat);
					break;
					
				default: 
					System.out.println("You're not too sure what to add.");
					break;
				}
				
				break;
			case "remove":
				System.out.println("You go to the nearest shelf to take out something from your cart. What do you remove?");
				String remove = scan.nextLine();
				
				//what will you remove (NOTE: i think i should use an int here like cart[i].remove(1);)
				System.out.println("Removed " + remove + ".");
				
				break;
			case "view":
				System.out.println("You peer into your cart to see whatever you bought.");
				cart.showCart();
				
				//NOTE: for some reason you cant scan after this?? like it's scanning you can't input. fix that later
				break;
			case "check out":
				inCheckOut=true;
				break;
			default:
				System.out.println("Please enter a valid input.");
				break;	
			}

			//check out
			while (inCheckOut) {
				String e = money > price ? "You go to the check-out and purchase your items." : "You don't have enough money.";
				System.out.println(e);
				purchased = e.contains("purchase") ? true : false;
				checkOutReturn = e.contains("purchase") ? false : true;

				//removing items and stealing stuff
				while (checkOutReturn) {
					System.out.println("Would you like to stay to remove items? (yes/no)");
					e = scan.nextLine();

					e = e.equals("yes") ? "You go back to the shelves to return items." : "So, uh, you steal the stuff you were supposed to buy.";
					System.out.println(e);
					purchased = e.contains("return") ? false : true;
					price = e.contains("return") ? price : 0;
					checkOutReturn=false;
				}

				inCheckOut=false;

			}

		} while (!purchased);
		money = money-price;

		//receipt
		inCheckOut=false;
		cart.showCart();
		System.out.println("Here is your receipt: \n Name: " + name + "\n Items bought: ");

		for (int i = 0; i < cart.length(); i++) {
			//NOTE: make a getter method for cart items (sighhhhh)
			
			//System.out.println(" " + cart.get);
		}
		
		System.out.println(" Price: " + price + "\n Money Left: " + money);
	}

}
