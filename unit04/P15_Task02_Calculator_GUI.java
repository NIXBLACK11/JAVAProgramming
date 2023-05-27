import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P15_Task02_Calculator_GUI {
    public static void main(String[] args) {
        Calculator obj = new Calculator();  
    }
}
class Calculator extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton add, sub, mul, div;
    JLabel res;
    public Calculator()
    {
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        res = new JLabel("Result");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div= new JButton("/");
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(res);
        //Ya to alag alag action listner banao
        ActionListener al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    Integer result = 0;
                    if(e.getSource()==add)
                    {
                        result = num1 + num2;
                    }
                    else if(e.getSource()==sub)
                    {
                        result = num1 - num2;
                    }
                    else if(e.getSource()==mul)
                    {
                        result = num1 * num2;
                    }
                    else if(e.getSource()==div)
                    {
                        result = num1 / num2;
                    }
                    
                    res.setText(" ="+result.toString());
                }
                catch(Exception err)
                {
                    // err.printStackTrace();
                    String s = "Error";
                    res.setText(s);
                }
            }
        };
        add.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);// if removed setVisible(false);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}