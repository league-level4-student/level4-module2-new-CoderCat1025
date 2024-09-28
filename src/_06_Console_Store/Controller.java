package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Controller extends ConsoleItem{

	public Controller() {
		if(new Random().nextBoolean()) {
			//NOTE: ADD IMAGES PLEASE PLEASE PLEASE AAAAAA
			//dhruva brand controllers? ha
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 10;
		itemName = "gaming controller";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
