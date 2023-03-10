package Snake;

import java.util.ArrayList;
import java.util.Random;

public class Apple {

    private Apple apple;

    Random random = new Random();

    private ArrayList<Position> jablko = new ArrayList<>();

    public ArrayList<Position> getJablko() {
        return jablko;
    }





    public Apple() {

        int y = random.nextInt(Constants.canvasSize / Constants.imageSize);
        int x = random.nextInt(Constants.canvasSize / Constants.imageSize);
        jablko.add(new Position(x * Constants.imageSize, y * Constants.imageSize));

    }

    public void generateApple() {
        int y = random.nextInt(Constants.canvasSize / Constants.imageSize);
        int x = random.nextInt(Constants.canvasSize / Constants.imageSize);
        jablko.add(new Position(x * Constants.imageSize, y * Constants.imageSize));

    }


}
