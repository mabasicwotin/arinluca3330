
public class Board {

	private Tile[][] matrix;

	public Tile[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Tile[][] m) {
		this.matrix = m;
	}
	
	public Board(int sizex, int sizey)
	{
		matrix = new Tile[sizex][sizey];
	}
	
	public void setElement( Tile t, int x, int y)
	{
		matrix[x][y] = t;
	}
	
	public Tile getElement(int x, int y)
	{
		return matrix[x][y];
	}
}
