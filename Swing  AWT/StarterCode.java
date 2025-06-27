import javax.swing.*;
import java.awt.*;

public class StarterCode{
    StarterCode(){
        JFrame f = new JFrame("Swing");

        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JLabelText();

    }
          
}   