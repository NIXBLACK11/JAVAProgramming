package practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FlowLayout;
import javax.swing.*;

public class Graphicsss extends Canvas{
    public static void main(String[] args) {
        Graphicsss ob = new Graphicsss();
        JFrame f = new JFrame();
        f.add(ob);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics grap)
    {
        setForeground(Color.RED);
        grap.drawOval(120, 60, 30, 30);
        grap.drawOval(290, 60, 30, 30);
        grap.fillOval(160, 60, 30, 30);
        grap.fillOval(250, 60, 30, 30);
        grap.drawArc(200, 60, 50, 50, 240, 60);
        grap.drawRect(150, 40, 140, 90);
    }
}