package Grafika;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        Kino kino = new Kino();

        jFrame.add(kino);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jFrame.setResizable(false);
    }
}
