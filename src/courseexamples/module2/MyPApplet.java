package courseexamples.module2;

import processing.core.*;

public class MyPApplet extends PApplet {
	private String URL = "https://www.unbelievable-machine.com/wp-content/uploads/2015/05/i40_2-bitkom.jpg";
	private PImage backgroundImg;
	
	public void setup() {
		size(200, 200);
		backgroundImg = loadImage(URL, "jpg");
	}
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
	}

}
