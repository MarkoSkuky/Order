package Snake;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Apple2 {

    private Position position;

    private Random random = new Random();

    private Image image;

    public Position getPosition() {
        return position;
    }

    public Image getImage() {
        return image;
    }

    public Apple2(String path) {
        ImageIcon imageIcon = new ImageIcon(path);
        this.image = imageIcon.getImage();
        move();
    }

    public void move() {
        int x = random.nextInt(Constants.blockCount);
        int y = random.nextInt(Constants.blockCount);

        position = new Position(x * Constants.imageSize, y * Constants.imageSize);
    }
}
