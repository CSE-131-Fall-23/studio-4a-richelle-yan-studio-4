package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		// my flag
//		int paramGreen;
//		for (int i = 0; i < 8; i++) {
//			paramGreen = 15 * i + 100;
//			Color newc = new Color(100, paramGreen, 100);
//			StdDraw.setPenColor(newc);
//			double posY = 0.1 * i + 0.15;
//			StdDraw.filledRectangle(0.5, posY , 0.5, 0.05);
//		}
		
		// Norway flag
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.18, 0.3, 0.12, 0.12);
		StdDraw.filledRectangle(0.18, 0.7, 0.12, 0.12);
		StdDraw.filledRectangle(0.7, 0.3, 0.24, 0.12);
		StdDraw.filledRectangle(0.7, 0.7, 0.24, 0.12);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(0.38, 0.5, 0.04, 0.32);
		StdDraw.filledRectangle(0.5, 0.5, 0.44, 0.04);
	}
}