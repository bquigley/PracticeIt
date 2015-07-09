/*

Add the following accessor methods to your Rectangle class from the previous exercises:

public boolean contains(int x, int y)
public boolean contains(Point p)

Returns whether the given Point or coordinates lie inside the bounds of this Rectangle. The edges are included; for example, a rectangle with [x=2,y=5,width=8,height=10] will return true for any point from (2, 5) through (10, 15) inclusive.

(You don't need to write the class header or declare the fields; assume that this is already done for you. Just write your methods' complete code in the box provided.) See previous exercises for a description of the Rectangle and Point classes and their public members.

*/

public class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height){
		if (width < 0 || height < 0)
			throw new IllegalArgumentException();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, int width, int height) {
		x= p.x;
		y = p.y;
		this.width = width;
		this.height = height; 
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY(){
		return y;
	}

	public String toString(){
		String res = "Rectangle[";
		res += "x=" + x + ",";
		res += "y=" + y + ",";
		res += "width=" + width + ",";
		res += "height=" + height +"]";
		return res;
	}

	public boolean contains(int x, int y) {
		if (x >= this.x && x <= this.x+width &&
			y >= this.y && y <= this.y+height) {
			return true;
		}
		return false;
	}

	public boolean contains(Point p) {
		return contains(p.x, p.y);
	}
}

