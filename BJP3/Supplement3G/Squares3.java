/*
  Modify your Squares2 program from the previous exercise into a new class Squares3 that draws the following figures. (Go back to that problem and copy/paste your code here as a starting point.) Parameterize your program so that the figures have the sizes shown below. The top-right figure has size 50, and the bottom-right figure has size 180. */

import java.awt.*;

public class Squares3{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(400, 300);
	panel.setBackground(Color.CYAN);
	Graphics g = panel.getGraphics();

	addSquare(g, 50, 50, 100);
	addSquare(g, 250, 10, 50);
	addSquare(g, 180, 115, 180);
    }
    public static void addSquare(Graphics g, int x, int y, int size) {
	g.setColor(Color.RED);
	g.drawLine(x, y, x, y+size);
	g.drawLine(x, y, x+size, y);

	int x_pos;
	int y_pos;
	for (int i=1; i<=5; i++) {
	    x_pos = x+i*size/5;
	    y_pos = y + i*size/5;
	    g.drawLine(x, y_pos, x_pos, y_pos);
	    g.drawLine(x_pos, y, x_pos, y_pos);
	}
	g.setColor(Color.BLACK);
	g.drawLine(x, y, x+size, y+size);
    }
}
