import java.awt.*;
import java.applet.*;

/*<applet code=GraphicsMethods width = 500 height=500>
</applet> */

public class GraphicsEx extends Applet{
	public void init(){

	setBackground(Color.black);
	setForeground(Color.white);
	}

	public void paint(Graphics g){
	g.drawString("Hellow World", 50,50);
	}
	

}