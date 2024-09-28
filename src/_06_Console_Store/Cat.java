package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cat extends ConsoleItem{

	//NOTE: add images
	
	public Cat() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 15;
		itemName = "cat";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
