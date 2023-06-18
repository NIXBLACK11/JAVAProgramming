package practice;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Calc {
    public static void main(String[] args) {
        C ob =new C();
    }
}

class C extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JLabel l;
    C()
    {
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        l = new JLabel("Result");
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(l);
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = 0;
                if(e.getSource()==add)
                {
                    result = a+b;
                }
                else if(e.getSource()==sub)
                {
                    result = a-b;
                }
                else if(e.getSource()==mul)
                {
                    result = a*b;
                }
                else
                {
                    result =a/b;
                }
                l.setText(Integer.toString(result));
            }
        };
        add.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}