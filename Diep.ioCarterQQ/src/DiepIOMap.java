import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class DiepIOMap extends GameMap {

	private Tank tank1;
<<<<<<< HEAD
	public static List<Bullet> bullets;
=======
<<<<<<< HEAD
	static List<Bullet> bullets;
=======
	public static List<Bullet> bullets;
>>>>>>> 875a62e59aff7edec0b02484beab657a68aa8bae
>>>>>>> origin/master
	private List<ShootableFarm> shootables;
	private List<Tank> tankList;
	
	public DiepIOMap(Dimension defaultDim) {
		tankList = new ArrayList();
		shootables = new ArrayList();
		addTank();
		this.addShootableFarms();

	}
	public  void addShootableFarms(){
		for(int x = 0; x<50/* farm count */; x++){
			addFarm(new ShootableFarm(Math.random()*1400+10,Math.random()*850+10, 20.0, (double)20));
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
<<<<<<< HEAD
			int X = (int) bullets.get(x).getX();
			int Y = (int) bullets.get(x).getY();
=======
<<<<<<< HEAD
			int X = (int) bullets.get(x).getX();
			int Y = (int) bullets.get(x).getY();
=======
			int X = (int)bullets.get(x).getX();
			int Y = (int)bullets.get(x).getY();
>>>>>>> 875a62e59aff7edec0b02484beab657a68aa8bae
>>>>>>> origin/master
			for(int y = 0; y<shootables.size(); y++){
				if (X-shootables.get(y).getSize() > shootables.get(y).getX()+shootables.get(y).getSize() && X+shootables.get(y).getSize() < shootables.get(y).getX()-shootables.get(y).getSize() && Y+shootables.get(y).getSize() < shootables.get(y).getY()-shootables.get(y).getSize() && Y+shootables.get(y).getSize() > shootables.get(y).getY()-shootables.get(y).getSize()){
					bullets.get(x).terminate();
					shootables.get(y).terminate();
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
	public void addFarm(ShootableFarm farm){
		shootables.add(farm);

	}

}
