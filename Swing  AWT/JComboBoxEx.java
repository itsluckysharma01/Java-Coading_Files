import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxEx{
    JComboBoxEx(){
        JFrame f = new JFrame("Swing");
        String Lang[] = {"Hindi", "Math", "Science", " English"};
        JComboBox<String> j1 = new JComboBox<String>(Lang);
        f.add(j1);


        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JComboBoxEx();

    }
          
}   