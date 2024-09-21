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
		//dont initialize money+price here unless you're testing
		int money = 50;
		int price = 25;
		boolean purchased = false;
		boolean inCheckOut = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello shopper! What is your name?");
		String name = scan.nextLine();

		do {

			//check out
			do {
			inCheckOut = true;
			String e = money > price ? "You go to the check-out and purchase your items." : "You don't have enough money.";
			System.out.println(e);
			purchased = e.contains("purchase") ? true : false;
			
			System.out.println("Would you like to stay to remove items? (yes/no)");
			e = scan.nextLine();
			e = e.equals("yes") ? "You go back to the shelves to return items." : "So... You're just gonna steal? (yes/no)";
			System.out.println(e);
			inCheckOut = e.contains("return") ? false : true;
			
			scan.nextLine();
			e = e.equals("yes") ? "Okay... You steal all of the stuff in your cart." : "You go back to the shelves to return items.";
			System.out.println(e);
			price = 0;
			purchased = true;
			
			
			} while (inCheckOut);
			
		} while (!purchased);
		
		//receipt
		inCheckOut=false;
		System.out.println("Here is your receipt: \n Name: " + name);

	}

}
