//@author Usman :(
public class Point {
	private int x;
	private int y;
	//default constructor
	public Point() {
		this(0,0);
	}
	//modified constructor
	public Point (int x, int y) {
		setLocation(x, y);
	}
	//setLocation Method: set the input as coordinates 
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//getter for x-value
	public int getX() {
		return this.x;
	}
	//getter for y-value
	public int getY() {
		return this.y;
	}
	//finds distance from (0,0) to the current (x,y)
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	// returns a String version of the coordinate
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	//changes point to values passed in parameters
	public void translate(int dx, int dy) {
		setLocation(dx, dy);
	}
	//getter/accessor: quadrant() is #1
	public int quadrant() {
		if (x > 0) {
			if (y > 0) {
				return 1;
			}
			if (y < 0) {
				return 4;
			}
		}
		if (x < 0) {
			if (y > 0) {
				return 2;
			}
			if (y < 0) {
				return 3;
			}
		}
		if (x == 0 || y == 0) {
			return 0;
		}
		return -1;
	}
	//mutator/setter method: flip() is #2
	public void flip() {
		this.x = y;
		this.y = x;
		if (x < 0) {
			Math.abs(x);
		} else if (x > 0) {
			x = -x;
		}
		if (y < 0) {
			Math.abs(y);
		} else if (y > 0) {
			y= -y;
		}
	}
	//accessor/getter: manhattanDistance(Point anotherPoint) is #3
	public int manhattanDistance(Point other) {
		int difx = Math.abs(this.x-other.getX());
		int dify = Math.abs(this.y-other.getY());
		return difx + dify;
	}
	//accessor/getter: isVertical(Point anotherPoint) is #4
	public boolean isVertical(Point other) {
		if (this.x == other.getX()) {
			return true;
		} else {
			return false;
		}
	}
	//accessor/getter: slope(Point anotherPoint) is #5
	public double slope(Point other) {
		if (this.x == other.getX()) {
			throw new IllegalArgumentException();
		} else {
		double slope = (this.y-other.getY())/(this.x-other.getX());
		return slope;
		}
	}
	//accessor/getter: isCollinear(Point a, Point b) is #6
	public boolean isCollinear(Point a, Point b) {
		double slope1 = (this.y-a.getY())/(this.x-a.getX());
		double slope2 = (a.getY()-b.getY())/(a.getX()-b.getX());
		double slopeTotal = (this.y-b.getY())/(this.x-b.getX());
		if ((this.x-a.getX()) == 0 || (a.getX()-b.getX()) == 0 || (this.x-b.getX())== 0) {
			throw new IllegalArgumentException();
		} else if (slope1 == slope2 && slope1 == slopeTotal && slope2 == slopeTotal){
			return true;
		} else {
			return false;
		}
	}
}
