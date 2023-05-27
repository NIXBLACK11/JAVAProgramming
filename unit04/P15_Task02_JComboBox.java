import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class P15_Task02_JComboBox {
    public static void main(String[] args) {
        JComboBoxClass obj = new JComboBoxClass();
    }
}

class JComboBoxClass extends JFrame
{
    JComboBox jbox;
    JButton b;
    JLabel lab;
    public JComboBoxClass()
    {
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        jbox = new JComboBox<>(week);
        b = new JButton("Submit");
        lab = new JLabel("Choose a day from the list");
        add(jbox);
        add(b);
        add(lab);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if(jbox.getSelectedIndex() != -1)
                {
                    data = "Day Selected: " + jbox.getSelectedItem();
                    lab.setText(data);
                }
            }
        };
        b.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);// if removed setVisible(false);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}