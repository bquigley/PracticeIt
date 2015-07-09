/*


Add the following method to your Line class from the previous exercise:

public double getSlope()

Returns the slope of this line. The slope of a line between points (x1, y1) and (x2, y2) is equal to (y2 - y1) / (x2 - x1). If the two points have the same x-coordinates, the denominator is zero and the slope is undefined, so you should throw an IllegalStateException in this case.

(You don't need to write the class header or declare the fields; assume that this is already done for you. Just write your constructor's complete code in the box provided.) See the previous exercise for a description of the Line class and its public members.
*/

public class Line{
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public String toString(Point p) {
		return "(" + p.x + ", " + p.y + ")";
	}

	public String toString() {
		return "[" + toString(p1) + ", " + toString(p2) + "]";
	}

	public double getSlope() {
		if (p1.x == p2.x) 
			throw new IllegalStateException();
		double dy = p2.y - p1.y;
		double dx = p2.x - p1.x;
		return (double) dy/dx;
	}
}
