package practice;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        TwoNumbers ob = new TwoNumbers();
    }
}

class TwoNumbers extends JFrame
{
    JTextField t1;
    JTextField t2;
    JLabel l;
    JButton b;
    TwoNumbers()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l = new JLabel("Result:");
        b = new JButton("+");

        add(t1);
        add(t2);
        add(b);
        add(l);
        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                int res = 0;
                try{
                    res = num1+num2;
                    System.out.println(res);
                    l.setText(Integer.toString(res));
                }catch(Exception err)
                {
                    System.out.println(err.getMessage());
                    String s = "Out of bounds!";
                    l.setText(s);
                }
            }
        };
        b.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}