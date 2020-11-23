package paint;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class EventListener extends MouseAdapter implements ActionListener,MouseListener, MouseMotionListener {
	private int x1=0,x2=0,x3=0,y1=0,y2=0,y3=0;
	
//	private JPanel j1;
	private int flag=1; //������
	private Graphics g1;  //����
	private String shape; //��¼ͼ������
	private Color color;  //��¼��ɫ
	private Vector <Shape> vec; //���ͼ��
	Shape p; //�����ͼ����
	
	public void setG(Graphics g) {
		g1=g;
	}
	
	public void setVector(Vector sh_vec) {
		// TODO Auto-generated method stub
		vec=sh_vec;
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if(e1.getActionCommand().equals("")) {
			JButton bname=(JButton) e1.getSource();
			color=bname.getBackground();  //�õ���ɫ
		}
		else {
			JButton bname=(JButton) e1.getSource();
			shape=e1.getActionCommand();  //�õ���״
		}
	}
    
	@Override
	public void mouseClicked(MouseEvent e1) {
		// TODO Auto-generated method stub
		x3=e1.getX();
		y3=e1.getY();
		if(shape.equals("�����")&&flag==2) {
			p=new Polygon(shape,color,x2,y2,x3,y3);
			p.repaint(g1);
//			g1.drawLine(x2, y2, x3, y3);
			vec.add(p);
			x2=x3;
			y2=y3;
			
			if(e1.getClickCount()==2) {
//				g1.drawLine(x1, y1, x3, y3);
				p=new Polygon(shape,color,x1,y1,x3,y3);
			    p.repaint(g1);
			    vec.add(p);
			    flag=1;
		    }
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e1) {
		g1.setColor(color);
		if(flag==1) {
			x1=e1.getX();
			y1=e1.getY();
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e1) {
		if(flag==1) {
			x2=e1.getX();
			y2=e1.getY();
		}
		
		if (shape.equals("ֱ��")&&flag==1) {
//			g1.drawLine(x1, y1,x2,y2);
			p=new Line(shape,color,x1,y1,x2,y2);
			p.repaint(g1);
			vec.add(p);//��ֱ��ͼ�ε���ɫ��������Ϣ�����vector��
			
		}
		else if(shape.equals("Բ��")&&flag==1) {
			g1.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1-x2), Math.abs(y1-y2));
			p=new Oval(shape,color,x1,y1,x2,y2);
			p.repaint(g1);
			vec.add(p);
		}
		else if(shape.equals("����")&&flag==1) {
			p=new Rectangle(shape,color,x1,y1,x2,y2);
			p.repaint(g1);
			vec.add(p);
		}
		else if(shape.equals("�����")&&flag==1) {
			p=new Polygon(shape,color,x1,y1,x2,y2);
//			p.paint(g1);
			g1.drawLine(x1, y1, x2, y2);
			vec.add(p);
			flag++;
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e1) {
		// TODO Auto-generated method stub
		if(shape.equals("����")&&flag==1){
			x2=x1;
			y2=y1;
			x1=e1.getX();
			y1=e1.getY();
//			g1.drawLine(x1, y1, x2, y2);
			p=new Curve(shape,color,x1,y1,x2,y2);
			p.repaint(g1);
			vec.add(p);
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e1) {
		// TODO Auto-generated method stub
		
	}

}
