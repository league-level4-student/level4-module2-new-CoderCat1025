package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class ConsoleItem {
    String item;
    int price;

    public abstract JLabel getItem();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new ConsoleCart().getClass().getResourceAsStream("images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

