package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Chips extends ConsoleItem{
	
	//NOTE: add images (one should be fries, the other should be chips >:) hehe)

	public Chips() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 15;
	}
	
	@Override
	public JLabel getItem() {
		return new JLabel(loadImage(this.item));
	}

}
