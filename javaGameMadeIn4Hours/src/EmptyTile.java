import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class EmptyTile extends Tile {

	
	public EmptyTile(Position p)
	{

		img = new ImageIcon("Resources//Sprites//tile.png");

		pos = p;
	}
	
	
}
