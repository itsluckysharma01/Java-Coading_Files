import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
public class JLabelText{
    JLabelText(){
        JFrame f = new JFrame("Swing");
        // f.setLayout(new FlowLayout());
        // JLabel l = new JLabel("Welcome");
        // f.add(l);

        //set and get text
        // l.setText("Swing");
        // System.out.println(l.getText());
        // l.setFont(new Font("Verdana", Font.BOLD, 15));
        // System.out.println(l.getFont());

        // l.setForeground(Color.RED);
        // System.out.println(l.getForeground());

        // l.setBackground(Color.RED);
        // System.out.println(l.getBackground());
        // l.setOpaque(true);
        // System.out.println(l.isOpaque());

        // l.setHorizontalAlignment(JLabel.RIGHT);
        // System.out.println(l.getHorizontalAlignment());

        // l.setVerticalAlignment(JLabel.TOP);
        // System.out.println(l.getVerticalAlignment());

        // l.setDisplayedMnemonic('e');
        // l.setDisplayedMnemonic(KeyEvent.VK_E);
        // System.out.println(l.getDisplayedMnemonic());

        // l.setToolTipText("Welcome Swing");
        // System.out.println(l.getToolTipText());
    
        f.setLayout(new GridLayout(5,1));
        JLabel l = new JLabel("Username");
        JTextFieldEX tf1 = new JTextFieldEX(10);
        l.setDisplayedMnemonic('U');
        JLabel p = new JLabel("Passward");
        JTextFieldEX tf2 = new JTextFieldEX(10);
        p.setDisplayedMnemonic('P');
        l.setLabelFor(tf1);
        p.setLabelFor(tf2);
        f.add(l);  f.add(tf1);f.add(p); f.add(tf2);

       

        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JLabelText();

    }
          
}   