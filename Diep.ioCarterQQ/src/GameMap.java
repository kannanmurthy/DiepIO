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
    public static void removeGameObject(GameObject go){
        int x = 0;
        for(MovingObject k: movers){
            if(k.equals(go)){
                break;
            }
            x++;
        }
        movers.remove(x);
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