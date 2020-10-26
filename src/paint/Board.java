package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame implements ActionListener {
	public Board(){
		JFrame f1= new JFrame();
//	    JPanel p1=new JPanel();
//		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
//		p1.setBackground(Color.gray);
//		add(p1,BorderLayout.NORTH);
		
		Box b=Box.createVerticalBox();
		b.setBackground(Color.gray);
		add(b,BorderLayout.WEST);
		
		String btname[]= {"直线","矩形","圆形","弧线"};
		int i;
		for(i=0;i<btname.length;i++) {
			JButton button=new JButton(btname[i]);
			button.setPreferredSize(new Dimension(100,50));
			b.add(button);
			button.addActionListener(this);
		}	
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.gray);
		add(p2,BorderLayout.NORTH);
//		Box b=Box.createVerticalBox();
//		b.setBackground(Color.gray);
//		add(b,BorderLayout.WEST);
		Color colorname[]= {Color.WHITE,Color.BLACK,Color.CYAN,Color.RED,Color.GREEN,Color.YELLOW};
		for(i=0;i<colorname.length;i++) {
			JButton button=new JButton();
			button.setBackground(colorname[i]);
			button.setPreferredSize(new Dimension(30,30));
			p2.add(button);
		}
		setSize(640,480);
		setTitle("画图板");
		setVisible(true);
		setResizable(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
