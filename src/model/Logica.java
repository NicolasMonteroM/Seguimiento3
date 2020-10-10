package model;

import processing.core.PApplet;

public class Logica {
	
	Circle circle;
	Square square;
	PApplet app;
	boolean circleButton = false;
	boolean squareButton = false;
	
	public Logica(PApplet app) {
		
		circle = new Circle(app.width/2, app.height/2, 20, app);
		square = new Square(app.width/2, app.height/2, 20, app);
		
	}
	
	public void drawLogica(PApplet app) {
		
		
		if(circleButton) {
			
			circle.drawFigure(app.mouseY*2);
		
		}
		
		if(squareButton) {
			
			//square.rotateSquare(app.mouseY*2);
			square.drawFigure(app.mouseY*2);
			app.rotate(0);
		
		}
		
		
		//––––––––   buttons ––––––––––
		
		app.noStroke();
		
		app.fill(255);
		app.textAlign(app.CENTER);
		app.text("Generate:", app.width/2, 50);
		app.text("Mouse your mouse in 'y' axis to zoom in and zoom out", app.width/2, app.height-50);
		app.ellipse((app.width/2)-100, 100, 50, 50);
		
		app.rectMode(app.CENTER);
		app.rect((app.width/2)+100, 100, 45, 45);
		
		app.fill(50);
		app.text("Circle",(app.width/2)-100, 105);
		app.text("Square",(app.width/2)+100, 105);
		
	}
	
	public void interactions(PApplet app) {
		
		if(app.dist(app.mouseX, app.mouseY,(app.width/2)-100, 100)<40) {
			circleButton = true;
			squareButton = false;
		}
		
		if(app.dist(app.mouseX, app.mouseY,(app.width/2)+100, 100)<40) {
			squareButton = true;
			circleButton = false;
		}
		
	}

}
