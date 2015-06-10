/*

Write a complete program in a class named ShowDesign that uses the DrawingPanel to draw the following figure:
Java DrawingPanel close maximize minimize
expected output
(96, 6)

The window is 200 pixels wide and 200 pixels tall. The background is white and the foreground is black. There are 20 pixels between each of the four rectangles, and the rectangles are concentric (their centers are at the same point). Use a loop to draw the repeated rectangles.

(You don't need to include any import statements at the top of your program.) (The next exercise is a modified version of this program, so you can use the code you write here as a starting point for that exercise.)
*/

import java.awt.*;

public class ShowDesign{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(200, 200);
	Graphics g = panel.getGraphics();
	for (int i=0; i<4; i++) {
	    addRect(g, i*20+20, i*20+20, (80-i*20)*2);
	}
    }
    public static void addRect(Graphics g, int x, int y, int wh) {
	g.setColor(Color.BLACK);
	g.drawRect(x, y, wh, wh);
    }
}
