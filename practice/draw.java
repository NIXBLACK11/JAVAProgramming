package practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;

public class draw extends Canvas {
    public static void main(String[] args) {
        draw ob = new draw();
        JFrame f = new JFrame();
        f.add(ob); // Add the draw object to the JFrame
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ob.repaint(); // Trigger the painting process
    }

    public void paint(Graphics grap) {
        setForeground(Color.RED);
        setBackground(Color.YELLOW);
        grap.drawOval(5, 100, 20, 40);
        grap.drawRect(45, 0, 60, 20);
        grap.fillOval(45, 100, 20, 40);
    }
}
