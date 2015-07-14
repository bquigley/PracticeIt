/*
 Suppose that a class Point2D has been defined for storing a 2-dimensional point with x and y coordinates (both as doubles). 
(In our section handout, the class was called Point, but we have renamed it here because Practice-It uses a class named Point 
for other purposes.) The class includes the following members:
Name	Description
private double x 	the x coordinate
private double y 	the y coordinate
public Point2D() 	constructs the point (0, 0)
public Point2D(double x, double y) 	constructs a point with the given coordinates
public void setLocation(double x, double y) 	sets the coordinates to the given values
public double getX() 	returns the x coordinate
public double getY() 	returns the y coordinate
public String toString() 	returns a String in standard "(x, y)" notation
public double distance(Point p) 	returns the distance from another point

Your task is to modify the class to be Comparable by adding an appropriate compareTo method. Points should be compared relative 
to their distance from the origin, with points closer to the origin considered "less" than points farther from it. The distance 
between two points is defined as the square root of the sum of the squares of the differences between the x and y coordinates. 
*/

public class Point2D implements Comparable<Point2D> {
    private double x;
    private double y;
    
    public Point2D() {
        this(0.0, 0.0);
    }
    
    public Point2D(double x, double y) {
        setLocation(x, y);
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point2D other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

// YOUR CODE GOES HERE

    @Override
    public int compareTo(Point2D other) {
	Point2D origin = new Point2D();
	double d1 = this.distance(origin);
	double d2 = other.distance(origin);
	if (d1 < d2)
	    return -1;
	if (d1 > d2)
	    return 1;
	return 0;
    }
}
