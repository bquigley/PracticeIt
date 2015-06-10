/*
write a program in a class named Squares that uses the DrawingPanel to draw the following figure:
Java DrawingPanel close maximize minimize
expected output
(277, 63)

The drawing panel is 300 pixels wide by 200 pixels high. Its background is cyan. The horizontal and vertical lines are drawn in red and the diagonal line is drawn in black. The upper-left corner of the diagonal line is at (50,50). Successive horizontal and vertical lines are spaced 20 pixels apart.

(You don't need to include any import statements at the top of your program.) (The next two exercises are modified versions of this program, so you can use the code you write here as a starting point for those exercises.)

*/

import java.awt.*;

public class Squares{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(300, 200);
	panel.setBackground(Color.CYAN);
	Graphics g = panel.getGraphics();
	g.setColor(Color.RED);
	g.drawLine(50, 50, 50, 150);
	g.drawLine(50, 50, 150, 50);

	int pos;
	for (int i=1; i<=5; i++) {
	    pos = 50+i*20;
	    g.drawLine(50, pos, pos, pos);
	    g.drawLine(pos, 50, pos, pos);
	}
	g.setColor(Color.BLACK);
	g.drawLine(50, 50, 150, 150);
    }
}
