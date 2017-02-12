import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public abstract class GameMap {

	private List<MovingObject> movers;
	private List<ShootableFarm> Shootables;
	Image backgroundImage;
	
	public GameMap() {
		movers = new ArrayList();
		openBackgroundImage();
	}

	public void addGameObject(GameObject go) {
		movers.add(go);
	}
	public void removeGameObject(GameObject go){
		int x = 0;
		for(MovingObject k: movers){
			if(k.equals(go)){
				break;
			}
			x++;
		}
		movers.remove(x);
	}
	public void addFarm(ShootableFarm farm){
		Shootables.add(farm);
	}
	
	public abstract void openBackgroundImage(); 	
}
