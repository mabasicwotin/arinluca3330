import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Obstacle extends Tile{

	public Obstacle(Position p)
	{
		img = new ImageIcon("Resources//Sprites//obstacle.png");

		pos = p;
	}
}
