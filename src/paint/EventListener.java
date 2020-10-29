package paint;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class EventListener extends MouseAdapter implements ActionListener,MouseListener, MouseMotionListener {
	private int x1=0,x2=0,y1=0,y2=0;
	
//	private JPanel j1;
	private int flag=1; //步骤标记
	private Graphics g1;  //画笔
	private String shape; //记录图形
	private Color color;  //记录颜色
	Vector <Shape> sh_vec; //存放图形
	
	public void setG(Graphics g) {
		g1=g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if(e1.getActionCommand().equals("")) {
			JButton bname=(JButton) e1.getSource();
			color=bname.getBackground();  //得到颜色
		}
		else {
			JButton bname=(JButton) e1.getSource();
			shape=e1.getActionCommand();  //得到形状
		}
	}
    
	@Override
	public void mouseClicked(MouseEvent e1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e1) {
		g1.setColor(color);
		x1=e1.getX();
		y1=e1.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e1) {
		x2=e1.getX();
		y2=e1.getY();
		if (shape.equals("直线")) {
			g1.drawLine(x1, y1,x2,y2);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e1) {
		// TODO Auto-generated method stub
		if(shape.equals("曲线")){
			x2=x1;
			y2=y1;
			x1=e1.getX();
			y1=e1.getY();
			g1.drawLine(x1, y1, x2, y2);
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
