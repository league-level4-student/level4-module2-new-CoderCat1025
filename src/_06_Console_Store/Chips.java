package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Chips extends ConsoleItem{
	//chips??? fries??????
	public Chips() {
		if(new Random().nextBoolean()) {
			this.item = "chips.jpeg";
		}
		else {
			this.item = "fries.jpeg";
		}
		price = 5;
		itemName = "chips";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
