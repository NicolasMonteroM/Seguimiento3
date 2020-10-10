package view;

import model.Logica;
import processing.core.PApplet;

public class Main extends PApplet{

	Logica logica;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	@Override
	public void settings() {
		
		size(600,600);
	}
	
	@Override
	public void setup() {
		
		logica = new Logica(this);
		
	}
	
	@Override
	public void draw() {
		
		background(50);
		logica.drawLogica(this);
		
	}
	
	@Override
	public void mousePressed() {
		
		logica.interactions(this);

	}
}
