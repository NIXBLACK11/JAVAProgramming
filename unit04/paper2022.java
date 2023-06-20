import javax.swing.*;
// import java.awt.event.EventHan
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paper2022
{
    public static void main(String[] args) {
        Front ob = new Front();
    }    
}

class Front extends JFrame{
    JTextArea t;
    JButton b;
    JButton exit;
    JTextArea l;
    Front()
    {
        t = new JTextArea();
        l = new JTextArea();
        b = new JButton("ADD");
        exit = new JButton("EXIT");
        add(t);
        add(b);
        add(l);
        add(exit);
        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String curr = t.getText();
                String city = l.getText();
                l.setText(city+"\n"+curr);
            }
        };
        ActionListener exitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current JFrame
            }
        };
        b.addActionListener(al);
        exit.addActionListener(exitListener);
        setLayout(null);

        t.setBounds(60, 60, 100, 60);
        b.setBounds(60, 350, 100, 30);
        l.setBounds(500, 60, 100, 100);
        exit.setBounds(500, 400, 100, 30);
        setVisible(true);
        setSize(400, 200);
    }
}