import java.awt.*;

import javax.swing.*;

public abstract class Tile {
	protected ImageIcon img;
	protected Position pos;
	
	public void setImg(ImageIcon i)
	{
		img = i;
	}
	
	public ImageIcon getImg()
	{
		return img;
	}
	
	public void setPosition(Position p)
	{
		pos.setX(p.getX());
		pos.setY(p.getY());
	}
	
	public Position getPosition()
	{
		return pos;
	}
}
