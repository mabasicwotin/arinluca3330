import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementManager implements KeyListener{

	
	private Level l;
	public MovementManager(Level l)
	{
		super();
		this.l = l;
	}
	
	private int dx = 0;
	private int dy = 0;
	public void keyPressed(KeyEvent e) {

	    
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

	    if (key == KeyEvent.VK_LEFT) {
	        dy = -1;
	        dx = 0;
	        l.movePlayer(dx, dy);
	    }
	    if (key == KeyEvent.VK_RIGHT) {
	        dy = 1;
	        dx = 0;
	        l.movePlayer(dx, dy);
	    }

	    if (key == KeyEvent.VK_UP) {
	        dx = -1;
	        dy = 0;
	        l.movePlayer(dx, dy);
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        dx = 1;
	        dy = 0;
	        l.movePlayer(dx, dy);
	    }
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
