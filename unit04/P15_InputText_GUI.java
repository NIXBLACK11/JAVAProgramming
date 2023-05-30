import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class InputTextGUI extends JFrame{
	JTextArea ta1;
	JLabel l;
	JButton b1;
	InputTextGUI(){
		ta1= new JTextArea(5,30);
		b1=new JButton("Submit");
		l=new JLabel("Greetings");
		add(ta1);
		add(b1);
		add(l);
		ActionListener al = new ActionListener() {//interface
			@Override
			public void actionPerformed(ActionEvent e) { 
				String text=ta1.getText();
				l.setText(text);
			}
		};
	b1.addActionListener(al);
	setLayout(new FlowLayout());//automate layout
	setVisible(true);//if its false you can't see GUI
	setSize(400, 400);//set the size of each input 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class P15_InputText_GUI {

	public static void main(String[] args) {
		InputTextGUI obj=new InputTextGUI();

	}

}