import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

/*
<applet code="WindowedProgram" width = 300 height = 300>
</applet>
*/
public class WindowedProgram extends Applet{
	String msg = "";
	int X = 20;
	int Y = 20;
	public void init(){
		addKeyListener(new MyKeyAdapter());
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
	}
	class MyKeyAdapter extends KeyAdapter{
	public void keyTyped(KeyEvent ke){
		msg = msg + ke.getKeyChar();
		repaint();
	}
}

}
