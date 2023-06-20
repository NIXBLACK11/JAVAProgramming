import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paper2022se
{
    public static void main(String[] args) {
        fro ob = new fro();
    }
}


class fro extends JFrame
{
    JTextField a;
    JTextField b;
    JLabel l;
    JButton bu;
    fro()
    {
        a = new JTextField(10);
        b = new JTextField(10);
        l = new JLabel("Result");
        bu = new JButton("=");
        add(a);
        add(b);
        add(bu);
        add(l);
        ActionListener al = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt(a.getText());
                int y = Integer.parseInt(b.getText());
                int ans = (x*x - y*y);
                String res = Integer.toString(ans);
                l.setText(res);
            }
        };
        b.addActionListener(al);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}