package practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Buttons {
    public static void main(String[] args) {
        bb ob = new bb();
    }
}

class bb extends JFrame
{
    JRadioButton r1;
    JRadioButton r2;
    JCheckBox c1;
    JCheckBox c2;
    JButton b;
    JLabel l;
    bb()
    {
        r1 = new JRadioButton("RadioFirst");
        r2 = new JRadioButton("RadioSecond");
        c1 = new JCheckBox("CheckFirst");
        c2 = new JCheckBox("CheckSecond");
        b = new JButton("Submit:");
        l = new JLabel("Ans:");
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(c1);
        gp.add(c2);
        add(b);
        add(l);

        ActionListener al = new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String data = "";
                if(r1.isSelected())
                {
                    data = "RadioFirst";
                }
                if(r2.isSelected())
                {
                    data = "RadioSecond";
                }
                if(c1.isSelected())
                {
                    data = "CheckFirst";
                }
                if(c2.isSelected())
                {
                    data = "CheckSecond";
                }
                l.setText(data);
            }
        };
        b.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}