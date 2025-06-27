import javax.swing.*;
public class FrameInheritance extends JFrame{
    FrameInheritance()
    {
    setTitle("Frame");
    setSize(200,200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new FrameInheritance();
       
    }
}