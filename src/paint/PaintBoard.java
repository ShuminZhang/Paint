package paint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
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

public class PaintBoard extends JFrame {
	public PaintBoard(){
		
	}
	
	public void paint(Graphics g) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board pic = new Board();
//		pic.setTitle("画图板");
		
		JPanel j=new JPanel();
		Graphics g=j.getGraphics();
		
		pic.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}

}
