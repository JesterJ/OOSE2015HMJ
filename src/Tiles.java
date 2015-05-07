//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
//import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.BasicGame;

public class Tiles{
	public int rectWidth = 50;
	public int rectHeight = 50;
	public Shape rect1 = null;
	public Shape rect2 = null;
	public Shape rect3 = null;
	public Shape rect4 = null;
	
	float fall = 2f;
	

	public void falling(GameContainer arg0, int delta) throws SlickException {

	
			fall = fall + 0.05000f * delta;
			if (fall >= 550)
				fall = 550;
		
	}
	
	public void drawing(GameContainer arg0, Graphics arg1) throws SlickException {
		//arg1.draw(rect1 = new Rectangle(350, fall, 50, 50));

	}
	
	public void type (int number){
		if (number == 0){
		}
	}
	/*public void onStartUp(){
		rect1 = new Rectangle(0,0,rectWidth,rectHeight);
		rect2 = new Rectangle(0,0,rectWidth,rectHeight);
		rect3 = new Rectangle(0,0,rectWidth,rectHeight);
		rect4 = new Rectangle(0,0,rectWidth,rectHeight);
	}*/
	public void typeI(GameContainer arg0, Graphics arg1, int rot) throws SlickException {
		if (rot == 0){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2+50,fall,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
		}
		else if (rot== 1){
			rect1 = new Rectangle(Setup.width/2,fall-100,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall+50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
		else if (rot == 2){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2+50,fall,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
		else if (rot== 3){
			rect1 = new Rectangle(Setup.width/2,fall-100,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall+50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
	}
	public void typeL(GameContainer arg0, Graphics arg1, int rot) throws SlickException {
		if (rot == 0){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
		}
		if (rot == 1){
			rect1 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2-50,fall+50,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall+50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
		if (rot == 2){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2-100,fall+50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
		if (rot == 3){
			rect1 = new Rectangle(Setup.width/2-50,fall+50,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2-100,fall-50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
	}
	public void typeJ(GameContainer arg0, Graphics arg1, int rot) throws SlickException {
		if (rot == 0){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2-100,fall-50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
		}
		if (rot == 1){
			rect1 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2-50,fall+50,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
		if (rot == 2){
			rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2,fall+50,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
		}
		if (rot == 3){
			rect1 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
			rect2 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
			rect3 = new Rectangle(Setup.width/2,fall+50,rectWidth,rectHeight);
			rect4 = new Rectangle(Setup.width/2-50,fall+50f,rectWidth,rectHeight);
			arg1.draw(rect1);
			arg1.draw(rect2);
			arg1.draw(rect3);
			arg1.draw(rect4);
			}
	}
	public void typeT(GameContainer arg0, Graphics arg1) throws SlickException {
		rect1 = new Rectangle(Setup.width/2-100,fall,rectWidth,rectHeight);
		rect2 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
		rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
		rect4 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
		arg1.draw(rect1);
		arg1.draw(rect2);
		arg1.draw(rect3);
		arg1.draw(rect4);
	}
	public void typeO(GameContainer arg0, Graphics arg1) throws SlickException {
		rect1 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
		rect2 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
		rect3 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
		rect4 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
		arg1.draw(rect1);
		arg1.draw(rect2);
		arg1.draw(rect3);
		arg1.draw(rect4);
	}
	public void typeS(GameContainer arg0, Graphics arg1) throws SlickException {
		rect1 = new Rectangle(Setup.width/2-50,fall,rectWidth,rectHeight);
		rect2 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
		rect3 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
		rect4 = new Rectangle(Setup.width/2+50,fall-50,rectWidth,rectHeight);
		arg1.draw(rect1);
		arg1.draw(rect2);
		arg1.draw(rect3);
		arg1.draw(rect4);
	}
	public void typeZ(GameContainer arg0, Graphics arg1) throws SlickException {
		rect1 = new Rectangle(Setup.width/2-50,fall-50,rectWidth,rectHeight);
		rect2 = new Rectangle(Setup.width/2,fall-50,rectWidth,rectHeight);
		rect3 = new Rectangle(Setup.width/2,fall,rectWidth,rectHeight);
		rect4 = new Rectangle(Setup.width/2+50,fall,rectWidth,rectHeight);
		arg1.draw(rect1);
		arg1.draw(rect2);
		arg1.draw(rect3);
		arg1.draw(rect4);
	}
	
}
