package paint;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	protected String shape;
	protected Color color;
	protected int x1;
	protected int x2;
	protected int y1;
	protected int y2;
	
	public void Shape(String shape,Color color,int x1,int y1,int x2,int y2) {
		this.shape=shape;
		this.color=color;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;	
	}

	public abstract void repaint(Graphics g);
}
