package practice;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class TextArea {
    public static void main(String[] args) {
        Text ob = new Text();
    }
}

class Text
{
    JTextArea t1;
    JButton b;
    JLabel l;
    Text()
    {
        t1 = new JTextArea(30, 5);
        b = new JButton("put");
        l = new JLabel("Result");
        
    }
}