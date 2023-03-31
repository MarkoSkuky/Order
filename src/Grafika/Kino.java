package Grafika;

import javax.swing.*;
import java.awt.*;

public class Kino extends JPanel {
    private boolean[][] kino = new boolean[8][10];
    private static final int size = 64;

    public Kino() {
        setPreferredSize(new Dimension(kino.length*size, kino[0].length*size));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int riadok = 0; riadok < kino.length; riadok++) {
            for (int stlpec = 0; stlpec < kino[0].length; stlpec++) {
                if (!kino[riadok][stlpec]) {
                 ImageIcon imageIcon = new ImageIcon("assets/full.png");
                 g.drawImage(imageIcon.getImage(), riadok*size, stlpec*size, this);
                }
            }
        }
    }
}
