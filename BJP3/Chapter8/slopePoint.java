/*

Add the following method to the Point class:

public double slope(Point other)

Returns the slope of the line drawn between this Point and the given other Point. Use the formula (y2 - y1) / (x2 - x1) to determine the slope between two points (x1, y1) and (x2, y2). Note that this formula fails for points with identical x-coordinates, so throw an IllegalArgumentException in this case.

public class Point {
    private int x;
    private int y;
    
    // your code goes here
    
}


*/

public double slope(Point other) {
    int dx = x-other.x;
    if (dx == 0) {
	throw new IllegalArgumentException();
    }
    return (double) (y-other.y)/dx;
}
