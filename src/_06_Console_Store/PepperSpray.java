package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class PepperSpray extends ConsoleItem{

	public PepperSpray() {
		
		//to deal with scary people
		
		if(new Random().nextBoolean()) {
			this.item = "pink pepper spray.png";
		}
		else {
			this.item = "pepper spray.jpeg";
		}
		price = 10;
		itemName = "can of pepper spray";
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
