package guimodule;

import processing.core.PApplet;

public class myDisplay extends PApplet{

	
	
	public void setup(){
		size(400, 400);
		background(0);
	}
	
	public void draw(){
		fill(255, 255, 0);
		ellipse(200, 200, 200, 200);
		
		fill(0);
		ellipse(160, 180, 20, 60);
		ellipse(230, 180, 20, 60);
		
		fill (0);
		bezier(259, 250, 203, 281, 201, 276, 144, 250);
		fill (255, 255, 0);
		bezier(259, 250, 203, 281, 201, 276, 144, 250);
		//bezier(100, 150, 150, 180, 180, 200, 200, 295);
	}
}
