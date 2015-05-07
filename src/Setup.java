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
import java.util.Random;

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
	private Shape rightSide = null;
	private Shape leftSide = null;
	private boolean flInter = false;
	public boolean [][] posGrid = new boolean [width/50][height/50];
	private boolean rSInter = false;
	private boolean lSInter = false;
	Random r = new Random ();


		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
			
			floor = new Line(width,height, 0, height);
			rightSide = new Line(width,0,width,height);
			leftSide = new Line(0,0,0,height);
			//spawner();
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			/*if (flInter){
				spawner();
				flInter = false;
			}*/
			
			flInter = tiles.intersection(floor);
			rSInter = tiles.intersection(rightSide);
			lSInter = tiles.intersection(leftSide);
			
			if(flInter == false)tiles.falling(container, delta);
				
		}
		
		@Override
		public void render(GameContainer container, Graphics g) throws SlickException {	
			tiles.typeI(container, g, rotation, pos);
			if (flInter){
				spawner(container, g, rotation, pos);
				//flInter = false;
			}
			g.draw(floor);
			g.draw(rightSide);
			g.draw(leftSide);
			
			
			
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(width, height, false);
			
			//gamecontainer.setMinimumLogicUpdateInterval(5);
			
			gamecontainer.start();
			
		}
		public void grid (boolean[][] gridPos, int possition ){
			int temp = rotation;
			int temp2 = pos;
		}
		
			public void keyPressed (int key, char c){
				if (lSInter == false && rSInter == false && flInter == false && key == Input.KEY_F){
					Setup.rotation++;
					if(Setup.rotation == 4)
						Setup.rotation = 0;
				}
				if (lSInter == false && flInter == false && key == Input.KEY_K){
					pos = pos - 50;
				}
				if (rSInter == false && flInter == false && key == Input.KEY_L){
					pos = pos + 50;
				}
				/* if (rSInter == false && flInter == false && key == Input.KEY_M){
-					fall = fall + 50;
-				}*/ //could be implemented for faster falling (might need editing)
			}
			
			
	public void spawner(GameContainer container, Graphics g, int rot, int pos){
	
		int t = r.nextInt(7);
  
  		if(t == 0){
  			Tiles.typeI(container, g, rotation, pos);
		 }
  
  		if(t == 1){
  			Tiles.typeL(container, g, rotation, pos);
  		}
  
    	if(t == 2){
    		Tiles.typeJ(container, g, rotation, pos);
  		}
  
    	if(t == 3){
    		Tiles.typeT(container, g, rotation, pos);
  		}
  
    	if(t == 4){
    		Tiles.typeO(container, g, rotation, pos);
  		}
  
    	if(t == 5){
    		Tiles.typeS(container, g, rotation, pos);
  		}
  
    	if(t == 6){
    		Tiles.typeZ(container, g, rotation, pos);
  		}
	}



}
