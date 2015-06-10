/*


Modify your Squares program from the previous exercise into a new class Squares2 that draws the following figures. (Go back to that problem and copy/paste your code here as a starting point.)
Java DrawingPanel close maximize minimize
expected output
 

The drawing panel is now 400 by 300 pixels in size. The first figure is at the same position, (50,50). The other figures are at positions (250, 10) and (180, 115), respectively. Use one or more parameterized static methods to reduce the redundancy of your solution.


*/

import java.awt.*;

public class Squares2{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(400, 300);
	panel.setBackground(Color.CYAN);
	Graphics g = panel.getGraphics();

	addSquare(g, 50, 50);
	addSquare(g, 250, 10);
	addSquare(g, 180, 115);
    }

    public static void addSquare(Graphics g, int x, int y) {
	g.setColor(Color.RED);
	g.drawLine(x, y, x, y+100);
	g.drawLine(x, y, x+100, y);

	int x_pos;
	int y_pos;
	for (int i=1; i<=5; i++) {
	    x_pos = x+i*20;
	    y_pos = y + i*20;
	    g.drawLine(x, y_pos, x_pos, y_pos);
	    g.drawLine(x_pos, y, x_pos, y_pos);
	}
	g.setColor(Color.BLACK);
	g.drawLine(x, y, x+100, y+100);
    }
}
