/*




Add the following method to your Line class:

public boolean isCollinear(Point p)

Returns true if the given point is collinear with the points of this line; that is, if, when this Line is stretched infinitely, it would eventually hit the given point. Points are collinear if a straight line can be drawn that connects them. Two basic examples are three points that have the same x- or y-coordinate. The more general case can be determined by calculating the slope of the line between each pair of points and checking whether this slope is the same for all pairs of points. Use the formula (y2 - y1) / (x2 - x1) to determine the slope between two points (x1, y1) and (x2, y2).

(Note that this formula fails for points with identical x-coordinates, so this will have to be a special case in your code.) Since Java's double type is imprecise, round all slope values to four digits past the decimal point before you compare them.

(You don't need to write the class header or declare the fields; assume that this is already done for you. Just write your constructor's complete code in the box provided.) See the previous exercises for a description of the Line class and its public members.


*/

public class Line{
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
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

	public double getSlope(Point p1, Point p2) {
		Line line = new Line(p1, p2);
		return line.getSlope();
	}

	public boolean isCollinear(Point p) {
		if (p.x == p1.x && p.x == p2.x) {
			return true;
		} else if (p.y == p1.y && p.y == p2.y) {
			return true;
		} else if (p.x == p1.x || p.x == p2.x || p1.x == p2.x) {
			return false;
		} else if (p.y == p1.y || p.y == p2.y || p1.y == p2.y) {
			return false;
		}

		double s1 = getSlope(p, p1);
		double s2 = getSlope(p, p2);

		s1 = (double) Math.round(s1 * 1000) / 1000;
		s2 = (double) Math.round(s2 * 1000) / 1000;

		if (s1 == s2) 
			return true;
		return false;
	}
}
