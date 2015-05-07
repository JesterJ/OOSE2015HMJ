import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Setup extends BasicGame {
	public static int width = 800;
	public static int height = 600;
	Tiles tiles = new Tiles();
	//private Shape rect = null;


		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
		
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			tiles.falling(container, delta);
		}
		
		@Override
		public void render(GameContainer container, Graphics g) throws SlickException {	
			tiles.typeZ(container, g);
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(width, height, false);
			
			//gamecontainer.setMinimumLogicUpdateInterval(5);
			
			gamecontainer.start();
			
		}

	}
