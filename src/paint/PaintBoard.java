package paint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

/*һ���򵥵Ļ�ͼ�幤�ߣ��л�ͼ���͹�����
 * 1����4������ͼ��=��shape��-������1��2��3.����
 * 2����ɫ�ɱ��ѡ
 * 3������о���ʹ�ö�̬
 * 4���ܹ�������϶��ķ�ʽ��ͼ  MouseListener & MouseMotionListener
 * 5����û�����ͼ�ο��Ա������������ݽṹ��Vector������֮ǰ��shape���棬repaintʱ�Ὣ��ʷͼ�κ͵�ǰͼ��չʾ����
 *   super.paint(g)��ɾ������������ͼ
 * 6�����浽�ļ�
 */

public class PaintBoard extends JFrame {
	public PaintBoard(){
		
	}
	
	public void paint(Graphics g) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board pic = new Board();
//		pic.setTitle("��ͼ��");
		
		JPanel j=new JPanel();
		Graphics g=j.getGraphics();
		
		pic.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}

}
