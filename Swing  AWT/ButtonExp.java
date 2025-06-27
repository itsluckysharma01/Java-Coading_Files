import javax.swing.*;
// import Event class for the Event handling
import java.awt.event.*;
public class ButtonExp{
    ButtonExp(){
        JFrame f = new JFrame("Swing");
        JButtonEx b = new JButtonEx("Click Me");
        f.setSize(500,500);
        b.setBounds(100,100,200,50);
        f.add(b); 
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Event Handling for The Button
        b.addActionListener(    //action for corrosponding Buttons
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    b.setText("Hi Clicked");
                }
            }
        );

    }
    public static void main(String[] args) {
        new ButtonExp();
    }

}