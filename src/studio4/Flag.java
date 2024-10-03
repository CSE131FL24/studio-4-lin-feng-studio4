package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(214, 154, 237);
		StdDraw.filledRectangle(4,2,4,2);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.3);
		StdDraw.setPenColor(5, 5, 5);
		StdDraw.filledCircle(0.38, 0.6, 0.03);
		StdDraw.filledCircle(0.62, 0.6, 0.03);
		StdDraw.arc(0.5, 0.5, 0.21, 180, 0);
		StdDraw.setPenColor(230, 163, 21);
		double[] x = {0.1, 0.15, 0.18, 0.21, 0.26, 0.22, 0.24, 0.18, 0.12, 0.14, 0.1};
		double[] y = {0.85, 0.85, 0.91, 0.85, 0.85, 0.81, 0.74, 0.77, 0.74, 0.8, 0.85};
		StdDraw.filledPolygon(x, y);
		StdDraw.filledRectangle(0.8, 0.13, 0.009, 0.1);
		StdDraw.filledRectangle(0.9, 0.13, 0.009, 0.1);
		StdDraw.filledRectangle(0.85, 0.13, 0.065, 0.009);
	}
}