package paint;
import java.awt.BorderLayout;
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

public class PaintBoard extends JFrame implements ActionListener {
	public PaintBoard(){
		super("��ͼ��");
//		JPanel p1= new JPanel();
//		add(p1,BorderLayout.WEST);
//		p1.add(new JButton("ֱ��"));
//		p1.add(new JButton("����"));
//		p1.add(new JButton("Բ��"));
//		p1.add(new JButton("�����"));
		
		Box b1=Box.createVerticalBox();
		b1.add(new JButton("ֱ��"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("����"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("Բ��"));
		b1.add(b1.createVerticalStrut(10));
		b1.add(new JButton("�����"));
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
//		pic.setTitle("��ͼ��");
		pic.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}

}
