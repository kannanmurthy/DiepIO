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
            for(x=0; x<movers.size(); x++){
            	if(movers.get(x)==go)
            		break;
            }
        movers.remove(x);
    }
    
    
    public abstract void openBackgroundImage();


	public void draw(Graphics g) {
		for(int x = 0; x<movers.size(); x++){
			movers.get(x).draw(g);
		}
	}
	void checkBulletCollisions(){}
		public void tick() {
		for(int x = 0; x<movers.size(); x++){
			movers.get(x).move();
		}
		checkBulletCollisions();
		DiepIOMap.tankList.get(0).setSpeed(DiepIOMap.tankList.get(0).getSpeed()*74/75);
	}     
}