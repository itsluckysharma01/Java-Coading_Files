import javax.swing.*;
public class Frameexp{
    Frameexp(){
        JFrame f = new JFrame("Swing");
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(  
            new Runnable(){
            public void run(){
                new Frameexp();
            }
        }
    );
          
        
    }
}