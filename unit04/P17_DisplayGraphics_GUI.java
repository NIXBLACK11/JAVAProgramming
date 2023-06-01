import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class P17_DisplayGraphics_GUI extends Canvas{
    public static void main(String[] args) {
        P17_DisplayGraphics_GUI ob = new P17_DisplayGraphics_GUI();
        JFrame f = new JFrame();
        
        f.add(ob);
        f.setSize(500, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics grap)
    {
        grap.drawOval(120, 60, 30, 30);
        grap.drawOval(290, 60, 30, 30);
        setForeground(Color.RED);
        grap.fillOval(160, 60, 30, 30);
        grap.fillOval(250, 60, 30, 30);
        grap.drawArc(200, 60, 50, 50, 240, 60);
        grap.drawRect(150, 40, 140, 90);
    }
}
