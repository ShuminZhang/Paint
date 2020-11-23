package paint;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	protected String shape;
	protected Color color;
	protected int x1;
	protected int x2;
	protected int y1;
	protected int y2;
	
	public Shape(String shape,Color color,int x1,int y1,int x2,int y2) {
		this.shape=shape;
		this.color=color;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;	
	}

	public void repaint(Graphics g) {
		switch(shape){
		case "直线":{g.setColor(color);g.drawLine(x1, y1, x2, y2);}break;
		case "曲线":{g.setColor(color);g.drawLine(x1, y1, x2, y2);}break;
		case "圆形":{g.setColor(color);
		            g.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1-x2), Math.abs(y1-y2));
		           } 
		          break;
		case "矩形":{g.setColor(color);
		            g.drawRect(Math.min(x1, x2), Math.min(y1 ,y2), Math.abs(x1-x2), Math.abs(y1-y2));
		           }
		          break;
		case "多边形":{g.setColor(color);g.drawLine(x1, y1, x2, y2);}break;
		}
	}
	
}
