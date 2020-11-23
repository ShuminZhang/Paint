package paint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import java.awt.*;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*һ���򵥵Ļ�ͼ�幤�ߣ��л�ͼ���͹�����
 * 1����4������ͼ��=��shape��-������1��2��3.����
 * 2����ɫ�ɱ��ѡ
 * 3������о���ʹ�ö�̬
 * 4���ܹ�������϶��ķ�ʽ��ͼ  MouseListener & MouseMotionListener
 * 5����û�����ͼ�ο��Ա������������ݽṹ��Vector������֮ǰ��shape���棬repaintʱ�Ὣ��ʷͼ�κ͵�ǰͼ��չʾ����
 *   super.paint(g)��ɾ������������ͼ
 * 6�����浽�ļ�
 */

public class PaintBoard extends JFrame{
	Vector <Shape> sh_vec=new Vector<Shape>();//��Ż�����ͼ����Ϣ
	
	public PaintBoard(){
		super("��ͼ��");
		JFrame f1= new JFrame();
		EventListener el=new EventListener();//ʵ����һ��EventLiatener,ʵ�ֶ���ӿ�
		
		//����
		JPanel p1=new JPanel();
		p1.setBackground(Color.WHITE);
		add(p1,BorderLayout.CENTER);  
		
		//������
		Box b=Box.createVerticalBox();
		b.setBackground(Color.gray);
		add(b,BorderLayout.WEST);	
		String btname[]= {"ֱ��","����","Բ��","����","�����"};
		int i;
		for(i=0;i<btname.length;i++) {
			JButton button=new JButton(btname[i]);
//			button.setPreferredSize(new Dimension(200,70));
			b.add(button);
			button.addActionListener(el);
		}	
		
		//��ɫ��
		JPanel p2=new JPanel();
		p2.setBackground(Color.gray);
		add(p2,BorderLayout.NORTH);
		Color colorname[]= {Color.WHITE,Color.BLACK,Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW,Color.MAGENTA};
		for(i=0;i<colorname.length;i++) {
			JButton button=new JButton();
			button.setBackground(colorname[i]);
			button.setPreferredSize(new Dimension(30,30));
			p2.add(button);
			button.addActionListener(el);
		}
		
		//��������
		setSize(640,480);
//		setTitle("��ͼ��");
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Graphics g = this.getGraphics();//����
		el.setG(g);//����ʹ�û���
		this.addMouseListener(el);
		this.addMouseMotionListener(el);
		
		//���ͼ��
		el.setVector(sh_vec);
	}
	
	//��дpaint������ʹ�ô��ڱ仯ʱͼ������
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<sh_vec.size();i++) {
			if(sh_vec.get(i)!=null) {
				sh_vec.get(i).repaint(g);
			}
			else {
				break;
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaintBoard pic1 = new PaintBoard();

	}

}
