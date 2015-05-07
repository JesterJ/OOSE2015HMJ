import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Setup extends BasicGame {
	
	private Shape rect = null;

		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
			rect = new Rectangle(100,100,100,100);
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			
		}
		
		@Override
		public void render(GameContainer container, Graphics g) throws SlickException {	
			g.draw(rect);
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(800, 600, false);
			
			gamecontainer.start();
			
		}

	}
