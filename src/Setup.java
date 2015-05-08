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
	public int width = 600;
	public int height = 800;
	public int rotation = 0;
	public int pos = 0;
	Tiles tiles = new Tiles();
	Tiles next = new Tiles();
	//Player player = new Player();
	public int left = 0;
	public int right = 0;
	public int key = Input.ANY_CONTROLLER;
	public char something;
	private Shape floor = null;
	private Shape rightSide = null;
	private Shape leftSide = null;
	private boolean flInter = false;
	//public boolean [][][] posGrid = new boolean [][][];
	private boolean rSInter = false;
	private boolean lSInter = false;
	private boolean rec101 = false;
	private boolean rec102 = false;
	private boolean rec103 = false;
	private boolean rec104 = false;
	private boolean rec202 = false;
	private boolean rec203 = false;
	private boolean rec204 = false;
	private boolean rec303 = false;
	private boolean rec304 = false;
	private boolean rec404 = false;
	Random r = new Random ();
	public int curTile;
	public int curTile2;
	public int curRot;
	public int curPos;
	public boolean nextTile = false;
	public boolean firstRun = false;


		public Setup(String title) {
			super(title);
			
		}
		
		@Override
		public void init(GameContainer container) throws SlickException {
			tiles.fall = 50;
			int t = r.nextInt(7);
			curTile = t;
			spawner();
			floor = new Line(width,height, 0, height);
			rightSide = new Line(width,0,width,height);
			leftSide = new Line(0,0,0,height);
		}
		
		@Override
		public void update(GameContainer container, int delta) throws SlickException {
			if (flInter == true || rec101 == true || rec102 == true || rec103 == true || rec104 == true ||
				rec202 == true  || rec203 == true || rec204 == true || rec303 == true || rec304 == true ||
				rec404 == true){
				curTile2=curTile;
				next.type (curTile2, rotation, pos);
				firstRun = true;
				int t = r.nextInt(7);
				curTile = t;
				pos = 0;
				rotation = 0;
				tiles.fall = 50f;
				flInter = false;
			}
			spawner();
			flInter = tiles.intersection(floor);
			rSInter = tiles.intersection(rightSide);
			lSInter = tiles.intersection(leftSide);
			if (firstRun){
			rec101 = tiles.intersection(next.rect1);
			rec102 = tiles.intersection(next.rect2);
			rec103 = tiles.intersection(next.rect3);
			rec104 = tiles.intersection(next.rect4);
			rec202 = tiles.intersection(next.rect2);
			rec203 = tiles.intersection(next.rect3);
			rec204 = tiles.intersection(next.rect4);
			rec303 = tiles.intersection(next.rect3);
			rec304 = tiles.intersection(next.rect4);
			rec404 = tiles.intersection(next.rect4);
			}
			
			if(flInter == false && rec101 == false && rec102 == false && rec103 == false && rec104 == false &&
				rec202 == false && rec203 == false && rec204 == false && rec303 == false && rec304 == false &&
				rec404 == false)
				tiles.falling(container, delta);
				
		}
		
		@Override
		public void render(GameContainer container, Graphics g) throws SlickException {	
			
			if (firstRun){
				next.drawing(container, g);
			}
			tiles.drawing(container, g);
			//g.draw(floor);
			g.draw(rightSide);
			g.draw(leftSide);
			
			
			
		}

		public static void main(String[] args) throws SlickException{
		
			AppGameContainer gamecontainer = new AppGameContainer(new Setup("Setup Test"));
			
			gamecontainer.setDisplayMode(600, 800, false);
			
			//gamecontainer.setMinimumLogicUpdateInterval(5);
			
			gamecontainer.start();
			
		}
		/*public void grid (boolean[][] gridPos, int possition ){
			int temp = rotation;
			int temp2 = pos;
		}*/
		
			public void keyPressed (int key, char c){
				if (lSInter == false && rSInter == false && flInter == false && key == Input.KEY_I){
					rotation++;
					if(rotation == 4)
						rotation = 0;
				}
				if (lSInter == false && flInter == false && key == Input.KEY_J){
					pos = pos - 50;
				}
				if (rSInter == false && flInter == false && key == Input.KEY_L){
					pos = pos + 50;
				}
				if (flInter == false && key == Input.KEY_K){
					tiles.fall = tiles.fall + 50f;
				} 
			}
			
			
	public void spawner(){
		tiles.type(curTile, rotation, pos);
	}
	
	
	
/* public void Score(){
int lane1 = 20;
int lane2 = 50;
int lane3 = 80;
int lane4 = 120;
int score = 0;
int mScore;


if(elimination == 1){ // if 1 lane is eliminated then add points
  mScore = score + lane1;
}

if(elimination == 2){
  mScore = score + lane2;
}

if(elimination == 3){
  mScore = score + lane3;
}

if(elimination == 4){
  mScore = score + lane4;
}

score = mScore;


JTextField wScore = new JTextField("Score: " + score ,30); //(import JTextField() library), Shows score an undefined place

} */



}
