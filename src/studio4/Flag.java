package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.75, 0.2);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.075);
		StdDraw.line(0.1, 0.2, 0.9, 0.8);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.075);
		StdDraw.line(0.1, 0.8, 0.9, 0.2);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0, 1, 1, 0.2);
		StdDraw.filledRectangle(0, 0, 1, 0.2);
		StdDraw.filledRectangle( 0, 0, 0.1, 1);
		StdDraw.filledRectangle( 1, 0, 0.1, 1);
	}
}