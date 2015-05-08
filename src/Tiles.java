//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
//import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;


public class Tiles {
	public int rectWidth = 49;
	public int rectHeight = 49;
	public Shape rect1 = null;
	public Shape rect2 = null;
	public Shape rect3 = null;
	public Shape rect4 = null;
	
	public float posY = 750;
	public boolean intersect1 = false;
	public boolean intersect2 = false;
	public boolean intersect3 = false;
	public boolean intersect4 = false;

	public void falling(GameContainer arg0, int delta) throws SlickException {
			posY = posY + 0.05000f * delta;
	}

	public boolean intersection(Shape i){
		intersect1 = rect1.intersects(i);
		intersect2 = rect2.intersects(i);
		intersect3 = rect3.intersects(i);
		intersect4 = rect4.intersects(i);
			
		if(intersect1 == true || intersect2 == true || intersect3 == true || intersect4 == true) return(true);
		
		else return(false);
	}
	
	public void drawing(GameContainer arg0, Graphics arg1) throws SlickException {
		arg1.draw(rect1);
		arg1.draw(rect2);
		arg1.draw(rect3);
		arg1.draw(rect4);

	}
	public void type (int type, int rot, int pos){
		//Type I
		if (type == 0){
			if (rot == 0){
				rect1 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
			}
			else if (rot== 1){
				rect1 = new Rectangle(600/2+pos,posY-150,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);				
				}
			else if (rot == 2){
				rect1 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
				}
			else if (rot== 3){
				rect1 = new Rectangle(600/2+pos,posY-150,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
		}
		//Type L
		if (type == 1){
			if (rot == 0){
				rect1 = new Rectangle(600/2+pos-100,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos-50,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);				
				}
			if (rot == 1){
				rect1 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 2){
				rect1 = new Rectangle(600/2-100+pos,posY-50,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 3){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-100+pos,posY-100,rectWidth,rectHeight);
				}
		}
		//type J
		if (type == 2){
			if (rot == 0){
				rect1 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-100+pos,posY-50,rectWidth,rectHeight);
			}
			if (rot == 1){
				rect1 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
				}
			if (rot == 2){
				rect1 = new Rectangle(600/2-100+pos,posY-50,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
			}
			if (rot == 3){
				rect1 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				}
		}
		//Type T
		if (type == 3){
			if (rot == 0){
				rect1 = new Rectangle(600/2-100+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				}
			if (rot == 1){
				rect1 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 2){
				rect1 = new Rectangle(600/2-100+pos,posY-50,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 3){
				rect1 = new Rectangle(600/2-50+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2-100+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				}
		}
		//Type O
		if (type == 4){
			if (rot == 0){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 1){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 2){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
			if (rot == 3){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				}
		}
		//Type S
		if (type == 5){
			if (rot == 0){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY-50,rectWidth,rectHeight);
			}
			if (rot == 1){
				rect1 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+50+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
			}
			if (rot == 2){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY-50,rectWidth,rectHeight);
			}
			if (rot == 3){
				rect1 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+50+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
			}
		}
		//Type Z
		if (type == 6){
			if (rot == 0){
				rect1 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
			}
			if (rot == 1){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
			}
			if (rot == 2){
				rect1 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+50+pos,posY,rectWidth,rectHeight);
			}
			if (rot == 3){
				rect1 = new Rectangle(600/2-50+pos,posY,rectWidth,rectHeight);
				rect2 = new Rectangle(600/2-50+pos,posY-50,rectWidth,rectHeight);
				rect3 = new Rectangle(600/2+pos,posY-50,rectWidth,rectHeight);
				rect4 = new Rectangle(600/2+pos,posY-100,rectWidth,rectHeight);
			}
		}
	}	
}
