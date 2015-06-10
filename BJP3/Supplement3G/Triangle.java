/*


Using the DrawingPanel class, write a Java class named Triangle that produces the following figure:
Java DrawingPanel close maximize minimize
expected output
(204, 192)

    size: 600x200
    background color: yellow
    line color: blue
    vertical spacing between lines: 10 px

The diagonal lines connect at the bottom in the middle.

*/

import java.awt.*;

public class Triangle{
    public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(600, 200);
	panel.setBackground(Color.YELLOW);
	Graphics g = panel.getGraphics();
	g.setColor(Color.BLUE);
	for (int i=1; i<20; i++) {
	    g.drawLine(i*15, i*10, 600-i*15, i*10); 
	}
	g.drawLine(0, 0, 300, 200);
	g.drawLine(600, 0, 300, 200);
    }

}
