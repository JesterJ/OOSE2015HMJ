import org.newdawn.slick.Input;


public class Player {
	
	public void keyPressed (int key, char c){
		if (key == Input.KEY_F){
			Setup.rotation++;
			if(Setup.rotation == 4)
				Setup.rotation = 0;
		}
		if (key == Input.KEY_K){
			Setup.left = true;
		}
		if (key == Input.KEY_L){
			Setup.right = true;
		}
	}
	
	

}
