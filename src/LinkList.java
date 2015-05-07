import java.util.LinkedList;
import org.newdawn.slick.geom.Shape;

public class LinkList {

	LinkedList<Shape> ll = new LinkedList<Shape>();
	
	public void addList(Shape s){
		ll.add(s);
	}	
	
	public Shape getList(int i){
		
		Shape temp;
		
		if(i < 0 || i >= ll.size()){
			return(null);
		}
		
		temp = ll.get(i);
		
		return(temp);
	}
	
	public int listLength(){
		
		return ll.size();
		
	}
	
}
