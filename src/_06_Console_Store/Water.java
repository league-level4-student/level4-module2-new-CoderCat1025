package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Water extends ConsoleItem{

	public Water() {
		if(new Random().nextBoolean()) {
			//NOTE: ADD IMAGES PLEASE PLEASE PLEASE AAAAAA
			//bo'ol o' wo'er
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 10;
		itemName = "bottle of water";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
