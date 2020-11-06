package paint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.*;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*一个简单的画图板工具，有绘图区和工具栏
 * 1）画4种以上图形=》shape类-》子类1、2、3.。。
 * 2）颜色可变可选
 * 3）编程中尽量使用多态
 * 4）能够以鼠标拖动的方式作图  MouseListener & MouseMotionListener
 * 5）最好画过的图形可以保留，建立数据结构（Vector），将之前的shape保存，repaint时会将历史图形和当前图形展示出来
 *   super.paint(g)会删除曾经画过的图
 * 6）保存到文件
 */

public class PaintBoard extends JFrame{
	public PaintBoard(){
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
		String btname[]= {"直线","曲线","圆形","矩形","多边形"};
		int i;
		for(i=0;i<btname.length;i++) {
			JButton button=new JButton(btname[i]);
//			button.setPreferredSize(new Dimension(200,70));
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
		el.setG(g);//传参使用画笔
		this.addMouseListener(el);
		this.addMouseMotionListener(el);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaintBoard pic1 = new PaintBoard();

	}

}
