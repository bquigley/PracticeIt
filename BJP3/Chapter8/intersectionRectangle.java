/*




Add the following method to your Rectangle class from the previous exercises:

public Rectangle intersection(Rectangle rect)

Returns a new rectangle that represents the largest rectangular region completely contained within both this rectangle and the given other rectangle. If the rectangles do not intersect at all, returns null. Your method should not modify the current Rectangle or the one that is passed in as a parameter; you should create and return a new rectangle.

(You don't need to write the class header or declare the fields; assume that this is already done for you. Just write your method's complete code in the box provided.) See the previous exercises for a description of the Rectangle class and its public members.

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

	public Rectangle union(Rectangle rect) {
		int x = rect.getX();
		int y = rect.getY();
		int min_x = this.x;
		if (min_x > x) {
			min_x = x;
		}
		int max_x = this.x + this.width;
		if (max_x < x + rect.getWidth()) {
			max_x = x + rect.getWidth();
		}

		int min_y = this.y;
		if (min_y > y) 
			min_y = y;
		int max_y = this.y + this.height;
		if (max_y < y + rect.getHeight())
			max_y = y + rect.getHeight();
		int width = max_x - min_x;
		int height = max_y - min_y;
		Rectangle res = new Rectangle(min_x, min_y, width, height);
		return res;
	}

	public Rectangle intersection(Rectangle rect) {
		if (x+width < rect.getX() || rect.getX() + rect.getWidth() < x) {
			return null;
		}
		if (y+height < rect.getY() || rect.getY() + rect.getHeight() < y) {
			return null;
		}
		int[] xx = {x, x+width, rect.getX(), rect.getX() + rect.getWidth()};
		int[] yy = {y, y+height, rect.getY(), rect.getY() + rect.getHeight()};
		Arrays.sort(xx);
		Arrays.sort(yy);
		Rectangle res = new Rectangle(xx[1], yy[1], xx[2]-xx[1], yy[2]-yy[1]);
		return res;
	}

}

