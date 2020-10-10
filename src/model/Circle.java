package model;

import processing.core.PApplet;

public class Circle extends Figure{

	public Circle(float x, float y, int size, PApplet app) {
	
		super(x,y,size,app);
		
	}
	
	@Override
	public void drawFigure(float size) {
		
		app.stroke(255);
		app.fill(50);
		app.ellipse(super.x,super.y,size,size);
		
		if (size>1) {
			
			drawFigure(size-20);
		
		}
		
	}

}
