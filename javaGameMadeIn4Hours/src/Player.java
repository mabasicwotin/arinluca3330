import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player extends Tile{
	private String name;
	
	public Player(String name, Position p)
	{
		setName(name);
		pos = p;

		img = new ImageIcon("Resources//Sprites//player.png");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
