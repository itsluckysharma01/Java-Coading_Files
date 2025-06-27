import javax.swing.*;
import java.awt.*;

public class JCheckBoxEx{
    JCheckBoxEx(){
        JFrame f = new JFrame("Swing");
        JCheckBox c1=new JCheckBox("Cricket ");
        f.add(c1);
        JCheckBox c2=new JCheckBox("Cricket ");
        f.add(c2);
        JCheckBox c3=new JCheckBox("Cricket ");
        f.add(c3);

        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JCheckBoxEx();

    }
          
}   