import javax.swing.*;
import java.awt.*;

public class JButtonEx{
    JButtonEx(){
        JFrame f = new JFrame("Swing");
        JButton b=new JButton();
        f.add(b);

        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JButtonEx();
        
    }
          
}   