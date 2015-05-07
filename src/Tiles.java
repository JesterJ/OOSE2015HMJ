//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
//import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Tiles{
	//public Image Square = null;
	public Shape rect = null;
	float fall = 2;
	
	/*public static void main (String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new tiles ("test"));
		
		app.setDisplayMode(800,600, false);
		app.setAlwaysRender(true);
		app.start();
	}
*/
	
	public void falling(GameContainer arg0, int delta) throws SlickException {
	
			fall = fall + 0.05000f * delta;
			if (fall >= 550)
				fall = 550;
		
	}
	
	public void drawing(GameContainer arg0, Graphics arg1) throws SlickException {
		arg1.draw(rect = new Rectangle(350, fall, 50, 50));

	}
	
}
