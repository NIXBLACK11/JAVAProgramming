package practice;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class ListCombo
{
	public static void main(String args[])
	{
		C ob = new C();
	}
}

class C extends JFrame
{
	JComboBox jc;
	JList jl;
	JButton b;
	JLabel l;
	C()
	{
		
String s[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
jc = new JComboBox<>(s);
jl = new JList(s);
b = new JButton("=");
l = new JLabel("Day");
ActionListener al = new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	
if(e.selectedIndex()!=-1)
{	
	result = 
}
}
}



	}
}
