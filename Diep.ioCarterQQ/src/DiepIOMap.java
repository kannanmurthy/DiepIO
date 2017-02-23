import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class DiepIOMap extends GameMap {

	private Tank tank1;

	public static List<Bullet> bullets;

	public static List<ShootableFarm> shootables;
	public static List<Tank> tankList;
	
	public DiepIOMap(Dimension defaultDim) {
		tankList = new ArrayList();
		shootables = new ArrayList();
		addTank();
		this.addShootableFarms();

	}
	public  void addShootableFarms(){
		for(int x = 0; x<50/* farm count */; x++){
			new ShootableFarm(Math.random()*1450+40,Math.random()*805+25, 20.0, 20.0);
		}
	}

	public void move(){
		for(int x = 0; x<movers.size(); x++){
			movers.get(x).move();
		}
	}
	private void addTank(Tank t) {
        addGameObject(t);
	}

	private void checkBulletCollisions(){
		for(int x = 0; x<bullets.size(); x++){
			int X = (int) bullets.get(x).getX();
			int Y = (int) bullets.get(x).getY();

			for(int y = 0; y<shootables.size(); y++){
				if (X-shootables.get(y).getSize() > shootables.get(y).getX()+shootables.get(y).getSize() 
					&& X+shootables.get(y).getSize() < shootables.get(y).getX()-shootables.get(y).getSize() 
					&& Y+shootables.get(y).getSize() < shootables.get(y).getY()-shootables.get(y).getSize() 
					&& Y+shootables.get(y).getSize() > shootables.get(y).getY()-shootables.get(y).getSize()){
						shootables.get(y).setHealth(shootables.get(y).getHealth()-bullets.get(x).getPower());
						bullets.get(x).terminate();
							if(shootables.get(y).getHealth()<=0){
								shootables.get(y).terminate();
							}
					
					}
				}
			for(int y = 0; y<tankList.size(); y++){
				if (X-tankList.get(y).getSize() > tankList.get(y).getX()+tankList.get(y).getSize() 
					&& X+tankList.get(y).getSize() < tankList.get(y).getX()-tankList.get(y).getSize()
					&& Y+tankList.get(y).getSize() < tankList.get(y).getY()-tankList.get(y).getSize() 
					&& Y+tankList.get(y).getSize() > tankList.get(y).getY()-tankList.get(y).getSize()){
					tankList.get(y).setHealth(tankList.get(y).getHealth()-bullets.get(x).getPower());
					bullets.get(x).terminate();
					if(tankList.get(y).getHealth()<=0){
						tankList.get(y).terminate();
					}
					
				}
			}
		}
	}
	
	private void addTank() {
		tank1 =  new Tank(100,100, Color.black);
        addGameObject(tank1);       
	}


	@Override
	public void openBackgroundImage() {
		// TODO Auto-generated method stub

	}

}
