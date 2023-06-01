import java.awt.*;
import java.awt.event.*;

public class P17_Mouse_Motion_Listener_GUI extends MouseMotionAdapter {
    Frame f;

    P17_Mouse_Motion_Listener_GUI() {
        f = new Frame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 15, 15);
    }

    public static void main(String[] args) {
        new P17_Mouse_Motion_Listener_GUI();
    }
}