package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .3, .4, .08);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.5, .5, .4, .08);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .7, .4, .08);
		StdDraw.arc(0.55, 0.5, 0.1, 90, -90);
		StdDraw.arc(0.6, 0.5, 0.1, 90, -90);
	}
}