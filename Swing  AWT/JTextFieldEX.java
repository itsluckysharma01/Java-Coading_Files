import javax.swing.*;
import java.awt.*;

public class JTextFieldEX{
    JTextFieldEX(){
        JFrame f = new JFrame("Swing");
        JTextField tf1 = new JTextField(10);
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
