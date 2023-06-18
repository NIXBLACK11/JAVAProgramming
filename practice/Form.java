package practice;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Form {
    public static void main(String[] args) {
        gg ob = new gg();
    }
}

class gg extends JFrame
{
    JComboBox box;
    JList list;
    JButton b1;
    JLabel label;
    gg()
    {
        String l[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        box = new JComboBox<>(l);
        list = new JList(l);
        b1 = new JButton("=");
        label = new JLabel("ee");
        add(box);
        add(list);
        add(b1);
        add(label);
        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String data = "";
                if(list.getSelectedIndex()!=-1)
                {
                    data = "ans:" + list.getSelectedValue();
                    label.setText(data);
                }
                if(box.getSelectedIndex()!=-1)
                {
                    data = data + box.getSelectedItem();
                    label.setText(data);
                }
            }
        };
        b1.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}