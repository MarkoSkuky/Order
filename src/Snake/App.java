package Snake;

import javafx.geometry.Pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.ArrayList;

public class App extends JPanel implements KeyListener, ActionListener {

    private ArrayList<Snake> snakes = new ArrayList<>();
    private Apple apple = new Apple();
    private Apple2 apple2 = new Apple2("assets/apple.png");
    private int speed = 80;

    private final Timer timer;
    public App() {
        snakes.add(new Snake());
        snakes.add(new Snake());
        snakes.add(new Snake());
        snakes.add(new Snake());
        snakes.add(new Snake());
        snakes.add(new Snake());
        snakes.add(new Snake());

        timer = new Timer(speed, this);
        timer.start();
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(Constants.canvasSize, Constants.canvasSize));



    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        for (int i = 0; i < snakes.size(); i++) {
            Snake snake = snakes.get(i);


            if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
                snake.setDirection(Direction.LEFT);
            } else if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
                snake.setDirection(Direction.RIGHT);
            } else if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
                snake.setDirection(Direction.UP);
            } else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
                snake.setDirection(Direction.DOWN);
            }

            if (keyEvent.getKeyCode() == KeyEvent.VK_U) {
                snake.grow();
            }


        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_R) {
            snakes.add(new Snake());
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_S) {
            this.speed = speed - 5;
            timer.setDelay(speed);
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_D) {
            this.speed = speed + 5;
            timer.setDelay(speed);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int j = 0; j < snakes.size(); j++) {
            Snake snake = snakes.get(j);
            for (int i = 0; i < snake.getBody().size(); i++) {
                Position position = snake.getBody().get(i);
                ImageIcon imageIcon;
                if (i == 0 && snake.getDirection().equals(Direction.RIGHT)) {
                    imageIcon = new ImageIcon("assets/snake_right.png");

                } else if (i == 0 && snake.getDirection().equals(Direction.LEFT)) {
                    imageIcon = new ImageIcon("assets/snake_left.png");

                } else if (i == 0 && snake.getDirection().equals(Direction.UP)) {
                    imageIcon = new ImageIcon("assets/snake_up.png");

                } else if (i == 0 && snake.getDirection().equals(Direction.DOWN)) {
                    imageIcon = new ImageIcon("assets/snake_down.png");

                } else {
                    imageIcon = new ImageIcon("assets/square.png");

                }

                g.drawImage(imageIcon.getImage(), position.getX(), position.getY(), this);

            }
        }


        g.drawImage(apple2.getImage(), apple2.getPosition().getX(), apple2.getPosition().getY(), this);
    }
//        for (int i = 0; i < apple.getJablko().size(); i++) {
//            Position position = apple.getJablko().get(i);
//            ImageIcon imageIcon;
//            imageIcon = new ImageIcon("assets/apple.png");
//            g.drawImage(imageIcon.getImage(), position.getX(), position.getY(), this);
//        }



    private void checkApple() {
        for (int i = 0; i < snakes.size(); i++) {
            Snake snake = snakes.get(i);
            if (snake.getBody().get(0).getX() == apple2.getPosition().getX() && snake.getBody().get(0).getY() == apple2.getPosition().getY()) {
                snake.grow();
                apple2.move();
            }
        }
    }

    private void checkCollision() {
        for (int i = 0; i < snakes.size(); i++) {
            Snake snake = snakes.get(i);
            if (snake.getBody().get(0).getX() < 0 || snake.getBody().get(0).getY() < 0 || snake.getBody().get(0).getX() > Constants.canvasSize || snake.getBody().get(0).getY() > Constants.canvasSize) {
                snakes.remove(snake);
            continue;
            }

            for (int b = 1; b < snake.getBody().size(); b++) {
                Position position = snake.getBody().get(b);
                if (snake.getBody().get(0).getX() == position.getX() && snake.getBody().get(0).getY() == position.getY()) {
                    snakes.remove(snake);
                }
            }


        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < snakes.size(); i++) {
            Snake snake = snakes.get(i);
            snake.move();
        }
        repaint();
        checkApple();
        checkCollision();

    }
}
