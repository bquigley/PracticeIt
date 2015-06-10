/*


Write a program in a class named Spiral that uses the DrawingPanel to draw the following figure:
Java DrawingPanel close maximize minimize
expected output
(111, 36)

The window is 170 pixels wide and 170 pixels tall. The background is white and the spiral is black. The "spiral" lines start from (0, 10), going right 160, down 150, left 150, up 140, right 140, down 130, left 130, up 120, ... 

*/

import java.awt.*;

public class Spiral{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(170, 170);
	panel.setBackground(Color.WHITE);
	Graphics g = panel.getGraphics();

	g.setColor(Color.BLACK);

	char rotation = 'R'; // right
	int[] start = {0, 10};
	int [] end = new int[2]; // x y position
	
	// for (int width=160; width > 0; width -=10) {
	int width=160;
	int flag = 0; 
	while(width > 0) {
	    if (rotation == 'R') {
		end[0] = start[0] + width;
		end[1] = start[1];
	    } else if (rotation == 'D') { // down
		end[0] = start[0];
		end[1] = start[1] + width;
	    } else if (rotation == 'L') { // left
		end[0] = start[0] - width;
		end[1] = start[1];
	    } else { // up
		end[0] = start[0];
		end[1] = start[1] - width;
	    }
	    g.drawLine(start[0], start[1], end[0], end[1]);
	    if (rotation == 'R') {
		rotation = 'D';
	    } else if (rotation == 'D') {
		rotation = 'L';
	    } else if (rotation == 'L') {
		rotation = 'U';
	    } else {
		rotation = 'R';
	    }
	    start[0] = end[0];
	    start[1] = end[1];
	    flag++;
	    if (flag % 2 == 1) {
		width -= 10;
	    }
	   
	}
    }
}
