import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public abstract class GameMap {

    static List<MovingObject> movers;
    Image backgroundImage;
   
    public GameMap() {
        movers = new ArrayList();
        openBackgroundImage();
        
    }

    public void addGameObject(GameObject go) {
        movers.add(go);
    }
    public void removeGameObject(GameObject go){
        for(int y = 0; y<movers.size(); y++){
            if(movers.get(y).equals(go)){
                break;
            }
            y++
        }
        movers.remove(y);
    }
    
    
    public abstract void openBackgroundImage();

    public void shoot() {

    }

	public void draw(Graphics g) {
		for(MovingObject go:movers){
			go.draw(g);
		}
	}     
}
