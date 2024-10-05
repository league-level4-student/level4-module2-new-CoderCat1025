package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cat extends ConsoleItem{

	public Cat() {
		if(new Random().nextBoolean()) {
			this.item = "silly cat.png";
		}
		else {
			this.item = "other cat.jpeg";
		}
		price = 15;
		itemName = "cat";
	}

	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
