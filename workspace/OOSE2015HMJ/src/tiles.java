import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class tiles extends BasicGame {
	public Image Square = null;
	
	public tiles(String title) {
		super(title);
		
	}
	public static void main (String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new tiles ("test"));
		
		app.setDisplayMode(800,600, false);
		app.start();
	}
	public void init(GameContainer arg0) throws SlickException {
		Square = new Image ("/home/henrik/OOSE2015HMJ/images/Square.jpg");
	}
	
	public void update(GameContainer arg0, int arg1) throws SlickException {
			
		
	}
	
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		Square.draw(350, 0, 50, 50);
		
	}

}