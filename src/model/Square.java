package model;

import processing.core.PApplet;

public class Square extends Figure implements Rotation{

	public Square(float x, float y, int size, PApplet app) {
	
		super(x,y,size,app);
		
	}
	
	@Override
	public void drawFigure(float size) {
		
		app.rectMode(app.CENTER);
		app.stroke(255);
		app.fill(50);
		app.rect(super.x,super.y,size,size);
		
		if (size>1) {
			
			drawFigure(size-20);
		
		}
		
	}

	@Override
	public void rotateSquare(float angle) {
		
		app.translate(getPosX(), getPosY());
		app.rotate(app.radians(angle));
		
	}

}
