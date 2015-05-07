import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.KeyListener;

public class Setup extends BasicGame {
	public static int width = 600;
	public static int height = 800;
	public static int rotation = 0;
	public static int pos = 0;
	Tiles tiles = new Tiles();
	//Player player = new Player();
	public static int left = 0;
	public static int right = 0;
	public int key = Input.ANY_CONTROLLER;
	public char something;
	private Shape floor = null;
	private boolean flInter = false;


		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
			floor = new Line(width,height, 0, height);
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			
			//player.keyPressed(key, something);
			
			flInter = tiles.intersection(floor);
			
			if(flInter == false)tiles.falling(container, delta);
				
		}
		
		@Override
		public void render(GameContainer container, Graphics g) throws SlickException {	
			g.draw(floor);
			
			tiles.typeI(container, g, rotation, pos);
			
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(width, height, false);
			
			//gamecontainer.setMinimumLogicUpdateInterval(5);
			
			gamecontainer.start();
			
		}
		
			public void keyPressed (int key, char c){
				if (flInter == false && key == Input.KEY_F){
					Setup.rotation++;
					if(Setup.rotation == 4)
						Setup.rotation = 0;
				}
				if (flInter == false && key == Input.KEY_K){
					pos = pos - 50;
				}
				if (flInter == false && key == Input.KEY_L){
					pos = pos + 50;
				}
			}

	}
