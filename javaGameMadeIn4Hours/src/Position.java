
public class Position {

	private int x;
	private int y;
	
	public Position()
	{
		setX(0);
		setY(0);
	}
	public Position(int x1, int y1)
	{
		setX(x1);
		setY(y1);
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
