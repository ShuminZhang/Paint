package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame {
	public Board(){
		JFrame f1= new JFrame();
	    JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.setBackground(Color.gray);
		add(p1,BorderLayout.NORTH);
		
		String btname[]= {"ֱ��","����","Բ��","�����"};
		for(int i=0;i<btname.length;i++) {
			JButton button=new JButton(btname[i]);
			p1.add(button);
//			button.addActionListener();
		}	
		
		setSize(640,480);
		setTitle("��ͼ��");
		setVisible(true);
		setResizable(true);
	}
}
