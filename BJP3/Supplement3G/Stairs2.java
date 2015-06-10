/*
 Modify your Stairs program from the previous exercise to make a new class Stairs2 that draws the output shown below. Modify only the body of your loop. (You may want to make a new table to find the expressions for x, y, width, and height for each new output.)
*/



import java.awt.*;

public class Stairs2{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(110, 110);
	Graphics g = panel.getGraphics();
	for (int i=0; i<10; i++) {
	    g.drawRect(5, 5+i*10, 100-i*10, 10);
	}
    }
}
