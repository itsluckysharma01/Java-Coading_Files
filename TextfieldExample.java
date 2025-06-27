import javax.swing.*;
class MyFrame extends JFrame
{
    JTextField tf1, tf2,tf3;
    jButton b1, b2;
    Jlabel l1, l2 ,l3;

    void Myframe(){
        super("Textfield Example");
        
        li = new Jlabel("First Label");
        li.setBounds(50,50,70,20);
        add(l1);
    
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    }

    public static void main(String arg[]){
        new MyFrame();
    }
    
    
}