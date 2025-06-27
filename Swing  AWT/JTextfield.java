import javax.swing.*;
import java.awt.*;

public class JTextField{
    JTextField(){
        JFrame f = new JFrame("Swing");
        JTextFieldEX tf1 = new JTextFieldEX();
        f.add(tf1);

        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args){
        new JTextFieldEX();

    }
          
}   