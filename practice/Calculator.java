package practice;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        calc ob = new calc();
    }
}

class calc extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton add;
    JButton sub;
    JButton div;
    JButton mul;
    JLabel l;
    calc()
    {
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");
        l = new JLabel("=");
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(div);
        add(mul);
        add(l);
        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = 0;
                String ans = "";
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
                else if(e.getSource()==div)
                {
                    result = a/b;
                }
                else
                {
                    ans = "NO Input";
                }
                ans = Integer.toString(result);
                l.setText(ans);
            }
        };
        add.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}