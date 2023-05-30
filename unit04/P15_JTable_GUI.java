import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class P15_JTable_GUI {
    public static void main(String[] args) {
        JTableClass obj = new JTableClass();
    }
}

class JTableClass extends JFrame
{
    JTable table;
    JTableClass()
    {
        String column[] = {"ee", "e" , "ff" , "gg"   };
        String data[][] = {{"0", "1" , "2"  , "3"   },
                           {"a", "bb", "ccc", "dddd"}};
        table = new JTable(data, column);
        table.setBounds(30, 30, 300, 100);
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        setLayout(new FlowLayout());
        setVisible(true);// if removed setVisible(false);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}