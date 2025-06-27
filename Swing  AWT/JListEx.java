import javax.swing.*;
import java.awt.*;

public class JListEx{
    JListEx(){
        JFrame f = new JFrame("Swing");

        String Lang[] = {"Hindi", "Math", "Science", " English"};
        JList<String> j1 = new JList<String>(Lang);
        f.add(j1);

        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane() .setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JListEx();

    }
          
}   