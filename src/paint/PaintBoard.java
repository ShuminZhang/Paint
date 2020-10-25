package paint;
import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

/*一个简单的画图板工具，有绘图区和工具栏
 * 1）画4种以上图形=》shape类-》子类1、2、3.。。
 * 2）颜色可变可选
 * 3）编程中尽量使用多态
 * 4）能够以鼠标拖动的方式作图  MouseListener & MouseMotionListener
 * 5）最好画过的图形可以保留，建立数据结构（Vector），将之前的shape保存，repaint时会将历史图形和当前图形展示出来
 *   super.paint(g)会删除曾经画过的图
 * 6）保存到文件
 */

public class PaintBoard extends JFrame implements ActionListener {
	public PaintBoard(){
		super("画图板");
//		JPanel p1= new JPanel();
//		add(p1,BorderLayout.WEST);
//		p1.add(new JButton("直线"));
//		p1.add(new JButton("矩形"));
//		p1.add(new JButton("圆形"));
//		p1.add(new JButton("多边形"));
		
		Box b1=Box.createVerticalBox();
		b1.add(new JButton("直线"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("矩形"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("圆形"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("多边形"));
		b1.add(b1.createVerticalStrut(10));
		add(b1);
		
		setSize(640,480);
		setVisible(true);
		setResizable(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaintBoard pic = new PaintBoard();
//		pic.setTitle("画图板");
		pic.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}

}
