package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class PepperSpray extends ConsoleItem{

	public PepperSpray() {
		if(new Random().nextBoolean()) {
			//NOTE: ADD IMAGES PLEASE PLEASE PLEASE AAAAAA
			//bo'ol o' wo'er
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 10;
		itemName = "can of pepper spray";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
