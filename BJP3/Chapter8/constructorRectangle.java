/*



Add the following constructor to your Rectangle class from the previous exercise:

public Rectangle(Point p, int width, int height)

Constructs a new rectangle whose top-left corner is specified by the given point and with the given width and height.

(You don't need to write the class header or declare the fields; assume that this is already done for you. Just write your constructor's complete code in the box provided.) See previous exercises for a description of the Rectangle and Point classes and their public members.

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

}

