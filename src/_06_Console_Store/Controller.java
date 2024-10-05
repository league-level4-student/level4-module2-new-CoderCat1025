package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Controller extends ConsoleItem{

	public Controller() {
		if(new Random().nextBoolean()) {
			//dhruva brand controllers? ha
			this.item = "controller.jpeg";
		}
		else {
			this.item = "other controller.jpeg";
		}
		price = 10;
		itemName = "gaming controller";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
