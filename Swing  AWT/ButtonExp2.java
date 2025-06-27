import javax.swing.*;
import java.awt.event.*;

public class ButtonExp2 implements ActionListener{
    JButtonEx b;
    ButtonExp2(){
        JFrame f = new JFrame("Swing");
        b = new JButtonEx("Click Me");
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.add(b);
        b.setBounds(100,100,100,30);
        b.setLayout(null);

        // Event Handler
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        b.setText("Hii Clicked");
    }
    public static void main(String[] args){
        new ButtonExp2();
    }
}