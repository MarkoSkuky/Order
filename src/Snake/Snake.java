package Snake;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

import java.util.ArrayList;
import java.util.Random;

public class Snake {

    private ArrayList<Snake> snakes = new ArrayList<>();

    private Snake snake;

    private Apple apple;

    private ArrayList<Position> body = new ArrayList<>();

    private Direction direction = Direction.RIGHT;

    public ArrayList<Position> getBody() {
        return body;
    }

    public Snake() {
        Random random = new Random();
        int y = random.nextInt(Constants.canvasSize / Constants.imageSize);
        body.add(new Position(8 * Constants.imageSize, y * Constants.imageSize));
        body.add(new Position(7 * Constants.imageSize, y * Constants.imageSize));
        body.add(new Position(6 * Constants.imageSize, y * Constants.imageSize));
        body.add(new Position(5 * Constants.imageSize, y * Constants.imageSize));
        body.add(new Position(4 * Constants.imageSize, y * Constants.imageSize));
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        switch (direction) {
            case UP:
                if (this.direction != Direction.DOWN) {
                    this.direction = direction;
            }
                break;
            case DOWN:
                if (this.direction != Direction.UP) {
                    this.direction = direction;
                }
                break;
            case LEFT:
                if (this.direction != Direction.RIGHT) {
                    this.direction = direction;
                }
                break;
            case RIGHT:
                if (this.direction != Direction.LEFT) {
                    this.direction = direction;
                }
                break;

        }
    }

    public void move() {

        for (int i = body.size() -1; i > 0; i--) {
            body.get(i).setX(body.get(i-1).getX());
            body.get(i).setY(body.get(i-1).getY());
        }
        if (direction.equals(Direction.RIGHT)) {
            body.get(0).incX(Constants.imageSize);
        } else if (direction.equals(Direction.UP)) {
            body.get(0).incY(Constants.imageSize * -1);
        } else if (direction.equals(Direction.DOWN)) {
            body.get(0).incY(Constants.imageSize);
        } else {
            body.get(0).incX(Constants.imageSize * -1);
        }
    }

    public void grow() {

        body.add(new Position(body.get(body.size()-1).getX(), body.get(body.size()-1).getY()));




    }




}
