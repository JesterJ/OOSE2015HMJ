//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
//import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Tiles{
	public int rectWidth = 50;
	public int rectHeight = 50;
	public Shape rect = null;
<<<<<<< HEAD
	public Shape typeI = null;
	public Shape typeL = null;
	public Shape typeJ = null;
	public Shape typeT = null;
	public Shape typeS = null;
	public Shape typeZ = null;
	public Shape typeO = null;
	int fall = 2;
	
	public void falling(GameContainer arg0, int arg1) throws SlickException {
=======
	float fall = 2;
	
	/*public static void main (String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new tiles ("test"));
		
		app.setDisplayMode(800,600, false);
		app.setAlwaysRender(true);
		app.start();
	}
*/
	
	public void falling(GameContainer arg0, int delta) throws SlickException {
>>>>>>> f6366e952fb83df03e256aacf350349942665ea4
	
			fall = fall + 0.05000f * delta;
			if (fall >= 550)
				fall = 550;
		
	}
	
	public void drawing(GameContainer arg0, Graphics arg1) throws SlickException {
		arg1.draw(rect = new Rectangle(350, fall, 50, 50));

	}
	
	public void type (int number){
		if (number == 0){
		}
	}
	public void onStartUp(){
	rect = 	new Rectangle(0,0,rectWidth,rectHeight);
	typeI = new Rectangle(0,0,rectWidth*4,rectHeight);
	
	}
	
}
