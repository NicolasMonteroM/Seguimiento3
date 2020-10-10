package model;

import processing.core.PApplet;

public abstract class Figure {

	public float x;
	public float y;
	public float size;
	public int limit;
	public PApplet app;
	
	public Figure(float x, float y, int size, PApplet app) {
		
		this.y = y;
		this.x = x;
		this.size = size;
		this.app = app;
		
	}
	
	public void drawFigure(float size) {
		
		
	}
	
	public float getPosX() {
		
		return x;
		
	}
	
	
	public float getPosY() {
		
		return y;
		
	}
	
	public void setPosX(float x) {
		
		this.x = x;
		
	}
	
	public void setPosY(float y) {
		
		this.y = y;
		
	}
	
	public float getSize() {
		
		return size;
		
	}
	
	public void setSize(float size) {
		
		this.size = size;
		
	}

}
