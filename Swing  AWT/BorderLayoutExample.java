import javax.swing.*;
package layouts;
import java.awt.BorderLayout;

public class BorderLayoutExample{
    public static void main(String[] args){

        JFrame f = new JFrame("Border Layout");
        f.setVisible(true);
        f.setBounds(300,200,500,300);
        f.setLocationRelativeTo(null);
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();

        JButton b1 = new JButton("Page Start");
        JButton b2 = new JButton("Page End");
        JButton b3 = new JButton("Center");
        JButton b4 = new JButton("Line Start");
        JButton b5 = new JButton("Line End");
        c.add(b1, BorderLayout.PAGE_START);
        c.add(b2, BorderLayout.PAGE_END);
        c.add(b3, BorderLayout.CENTER);
        c.add(b4, BorderLayout.LINE_START);
        c.add(b5, BorderLayout.LINE_END);


    }

   
}