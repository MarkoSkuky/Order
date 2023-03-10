package Snake;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        App app = new App();
        jFrame.addKeyListener(app);
        jFrame.add(app);
        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
    }
}
