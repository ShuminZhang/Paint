package paint;

import java.awt.Graphics;

public class Shape {

	private  String name;
	protected int x1;
	protected int x2;
	protected int y1;
	protected int y2;
	
	public Shape(String name,int x1,int x2,int y1,int y2) {
		this.name=name;
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public void paint(Graphics g) {
		
	}
}
