package classe_Abstract;

public abstract class Shape {

	private int x;
	private int y;

	public abstract float getArea();

	public abstract int getPerimeter();

	public String getPosition() {
		return "(" + x + "," + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
