package paint;

import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends Shape {
	private String shape;
	private Color color;
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public Polygon(String name,Color color, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.shape=shape;
		this.color=color;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;	
	}

	@Override
	public void repaint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

}
