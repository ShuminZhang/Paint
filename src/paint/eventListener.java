package paint;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class eventListener extends JFrame implements ActionListener {
	private int x1,x2,y1,y2;
	
	private JPanel j1;
	private Graphics g1;
	
	public void mouseClick(MouseEvent e1) {
		
	}
	
	public void mousePressed(MouseEvent e1) {
		x1=e1.getX();
		y1=e1.getY();
	}
	
	public void mouseReleased(MouseEvent e1) {
		x2=e1.getX();
		y2=e1.getY();
		g1.drawLine(x1, y1, x2, y2);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}

}
