import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P15_RadioButton {
    public static void main(String[] args) {
        RadioButtonClass obj = new RadioButtonClass();
    }
}

class RadioButtonClass extends JFrame
{
    JTextField textField;
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JButton b;
    JLabel l;
    RadioButtonClass()
    {
        textField = new JTextField(10);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Singer");
        c2 = new JCheckBox("Dancer");
        b = new JButton("Submit");
        l = new JLabel("Greetings");

        add(textField);
        add(r1);
        add(r2);

        add(c1);
        add(c2);

        add(b);
        add(l);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // ButtonGroup bg = new ButtonGroup();
        // bg.add(c1);
        // bg.add(c2);

        ActionListener al = new ActionListener() {//interface
			@Override
			public void actionPerformed(ActionEvent e) { 
				String text = "";
                text = textField.getText() + " is ";
                if(r1.isSelected())
                {
                    text = "Mr" + text;
                }
                if(r2.isSelected())
                {
                    text = "Mrs" + text;
                }
                if(c1.isSelected())
                {
                    text = text + "Singer";
                }
                if(c2.isSelected())
                {
                    text = text + "and" + "Dancer";
                }
				l.setText(text);
			}
	    };

        b.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);// if removed setVisible(false);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}