import java.util.Scanner;

public class GameManager extends Tile{
	
	public static void main(String arg[]) {
		
		int response = 0;
		int nrOfLvl = 2;
		Scanner s = new Scanner(System.in);
		while(response > nrOfLvl || response <= 0)
		{
			System.out.println("Choose a level:\n1\n2");
			response = s.nextInt();
			
		}
		if(response == 1) 
		{
			Level l = new Level();
			l.start(LevelLayout.lvl1, LevelLayout.lvl1X, LevelLayout.lvl1Y);
		}
		if(response ==2)
		{
			Level l = new Level();
			l.start(LevelLayout.lvl2, LevelLayout.lvl2X, LevelLayout.lvl2Y);
		}
		
	}
	
}
