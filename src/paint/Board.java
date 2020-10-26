package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame{
 public Board(){	 
	JFrame f1= new JFrame();
	EventListener el=new EventListener();//实例化一个EventLiatener,实现多个接口
	
	//画板
	JPanel p1=new JPanel();
	p1.setBackground(Color.WHITE);
	add(p1,BorderLayout.CENTER);  
	
	//工具栏
	Box b=Box.createVerticalBox();
	b.setBackground(Color.gray);
	add(b,BorderLayout.WEST);	
	String btname[]= {"直线","矩形","圆形","弧线"};
	int i;
	for(i=0;i<btname.length;i++) {
		JButton button=new JButton(btname[i]);
//		button.setPreferredSize(new Dimension(200,70));
		b.add(button);
		button.addActionListener(el);
	}	
	
	//颜色栏
	JPanel p2=new JPanel();
	p2.setBackground(Color.gray);
	add(p2,BorderLayout.NORTH);
	Color colorname[]= {Color.WHITE,Color.BLACK,Color.CYAN,Color.RED,Color.GREEN,Color.YELLOW};
	for(i=0;i<colorname.length;i++) {
		JButton button=new JButton();
		button.setBackground(colorname[i]);
		button.setPreferredSize(new Dimension(30,30));
		p2.add(button);
		button.addActionListener(el);
	}
	
	//窗口设置
	setSize(640,480);
	setTitle("画图板");
	setVisible(true);
	setResizable(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	Graphics g = this.getGraphics();//画笔
	this.addMouseListener(el);
	this.addMouseMotionListener(el);
}
 
    public void paint(Graphics g) {
		super.paint(g);
		
	}
}