
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Level extends JFrame{

	private Board b;
	private int x1;
	private int playerPosX;
	private int playerPosY;
	public void start(char[][] table, int x, int y)
	{
		this.addKeyListener(new MovementManager(this));
		x1 = x;
		b = new Board(x, y);
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				switch(table[i][j])
				{
					case('b'):
					{
						b.setElement(new Boulder(new Position(i, j)), i, j);
						break;
					}
					case('e'):
					{
						b.setElement(new EmptyTile(new Position(i, j)), i, j);
						break;
					}
					case('f'):
					{
						b.setElement(new Final(new Position(i, j)), i, j);
						break;
					}
					case('o'):
					{
						b.setElement(new Obstacle(new Position(i, j)), i, j);
						break;
					}
					case('p'):
					{
						playerPosX = i;
						playerPosY = j;
						b.setElement(new Player(" ",new Position(i, j)), i, j);
						break;
					}
				}
			}
		}
		//JFrame frame = new JFrame("Mr Musculo and the pile of gold");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(50 *x1, 50 *x1);
		this.setVisible(true);
		this.setTitle("Mr Musculo and the pile of gold");
		reDraw();		
	}

	public void reDraw()
	{
		JLabel[][] mat = new JLabel[x1][x1];
		JPanel content = new JPanel();
		content.setLayout(new GridLayout(0,x1));
		for(int i = 0; i < x1; i++)
		{
			for(int j = 0; j < x1; j++)
			{
				mat[i][j] = new JLabel(b.getElement(i, j).img);
				content.add(mat[i][j]);
			}
		}
		
		
		this.setContentPane(content);
		this.pack(); 

	}
	
	public void movePlayer(int dx, int dy)
	{
		int newX = playerPosX + dx;
		int newY = playerPosY + dy;
		if(newX >= 0 && newX < x1 && newY >=0 && newY < x1)
		{
			if(b.getElement(newX, newY).getClass() == EmptyTile.class)
			{
				Tile t;
				t = b.getElement(newX, newY);
				b.setElement(b.getElement(playerPosX, playerPosY), newX, newY);
				b.setElement(t,  playerPosX,  playerPosY);

				playerPosX = newX;
				playerPosY = newY;
				reDraw();
			}
			if(b.getElement(newX, newY).getClass() == Final.class)
			{
				System.out.println("YOU WIN!!!");
			}
			if(b.getElement(newX, newY).getClass() == Boulder.class && b.getElement(newX + dx, newY + dy).getClass() == EmptyTile.class)
			{
				System.out.println("b");
				Tile t;
				t = b.getElement(newX, newY);
				b.setElement(b.getElement(newX + dx, newY + dy), newX, newY);
				b.setElement(t,  newX + dx,  newY + dy);
				t = b.getElement(newX, newY);
				b.setElement(b.getElement(playerPosX, playerPosY), newX, newY);
				b.setElement(t,  playerPosX,  playerPosY);

				playerPosX = newX;
				playerPosY = newY;
				reDraw();
			}
		}
	}
}
