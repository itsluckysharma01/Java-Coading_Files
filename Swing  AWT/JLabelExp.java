import javax.swing.*;
import java.awt.*;
public class JLabelExp {
    public JLabelExp(){
        JFrame f = new JFrame("Swing");
        ImageIcon im = new ImageIcon("java.png");
        // JLabel l = new JLabel(im);
        // f.add(l);  
        // l.setText("Welcome");

        // JLabel l1 = new JLabel("LEFT", JLabel.LEFT);
        // JLabel l2 = new JLabel("RIGHT", JLabel.RIGHT);
        // JLabel l3 = new JLabel("CENTER", JLabel.CENTER);
        // JLabel l4 = new JLabel("LEADING", JLabel.LEADING);
        // JLabel l5 = new JLabel("TRAILING", JLabel.TRAILING);

        JLabel l1 = new JLabel("Swing", im, JLabel.LEFT);
        JLabel l2 = new JLabel("Swing", im, JLabel.RIGHT);
        JLabel l3 = new JLabel("Swing", im, JLabel.CENTER);
        JLabel l4 = new JLabel("Swing", im, JLabel.LEADING);
        JLabel l5 = new JLabel("Swing", im, JLabel.TRAILING);
        l1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        l2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        l3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        l4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        l5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);

        f.setSize(300,300);
        f.getContentPane() .setLayout(new GridLayout(5,1));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args ){
        new JLabelExp();
    }
}