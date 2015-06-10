/*


  Modify your ShowDesign class from the previous exercise into a new class ShowDesign2 that has a method named showDesign that accepts parameters for the window width and height and displays the rectangles at the appropriate sizes. For example, if your showDesign method was called with values of 300 and 100, the window would look like the following figure. */

import java.awt.*;

public class ShowDesign2 {
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(300, 100);
	Graphics g = panel.getGraphics();
	for (int i=0; i<4; i++) {
	    showDesign(g, i*30+30, i*10+10, 240-i*60, 80-i*20);
	}
    }
    
    public static void showDesign(Graphics g, int x, int y, int width, int height) {
	g.setColor(Color.BLACK);
	g.drawRect(x, y, width, height);
    }
}
