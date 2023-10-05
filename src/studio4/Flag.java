package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(.3, .5, .1, .2);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(.5, .5, .1, .2);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(.7, .5, .1, .2);
		
		StdDraw.setPenColor(0,37,144);
		double []x = {0.4,0.5,0.6};
		double []y = {0.7,0.5,0.7};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(0,37,144);
		double []z = {0.4,0.5,0.6};
		double []d = {0.3,0.5,0.3};
		StdDraw.filledPolygon(z, d);
		
	}
}