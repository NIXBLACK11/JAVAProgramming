import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class P15_JList_GUI {
    public static void main(String[] args) {
        JListClass obj = new JListClass();
    }
}

class JListClass extends JFrame
{
    JList jlist;
    JButton b;
    JLabel lab;
    public JListClass()
    {
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        jlist = new JList(week);
        b = new JButton("Submit");
        lab = new JLabel("Choose a day from the list");
        add(jlist);
        add(b);
        add(lab);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if(jlist.getSelectedIndex() != -1)
                {
                    data = "Day Selected: " + jlist.getSelectedValue();
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
