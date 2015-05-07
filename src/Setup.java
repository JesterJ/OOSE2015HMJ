import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Setup extends BasicGame {

		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
		
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			
			
		}
		
		@Override
		public void render(GameContainer container, Graphics arg1) throws SlickException {
			
			
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(800, 600, false);
			
			gamecontainer.start();
			
		}

	}
