import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutEx{
	public FlowLayoutEx(){
	
	JFrame f = new JFrame("Flow Layout");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(600,400);
	
	Container c = f.getContentPane();

	JButton b1=new JButton("Button 1");
	JButton b2=new JButton("Button 2");
	JButton b3=new JButton("Button 3");
	JButton b4=new JButton("Button 4");
	JButton b5=new JButton("Button 5");
	c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);

	FlowLayout flow=new FlowLayout();
	c.setLayout(flow);
	flow.setHgap(30);
	flow.setVgap(50);

	}	
	public static void main(String[] args){
	
	new FlowLayoutEx();
	}


}