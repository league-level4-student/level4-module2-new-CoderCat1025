package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Water extends ConsoleItem{

	public Water() {
		if(new Random().nextBoolean()) {
			//bo'ol o' wo'er
			this.item = "water.jpeg";
		}
		else {
			this.item = "other water.jpeg";
		}
		price = 10;
		itemName = "bottle of water";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
