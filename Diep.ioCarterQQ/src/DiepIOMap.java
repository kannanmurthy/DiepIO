import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class DiepIOMap extends GameMap {

	private Tank tank1;
	private List<ShootableFarm> shootables;
	private List<Tank> tankList;
	
	public DiepIOMap() {
		tankList = new ArrayList();
		shootables = new ArrayList();
		addTank();
		this.addShootableFarms();

	}
	public  void addShootableFarms(){
		for(int x = 0; x<200/* farm count */; x++){
			addFarm(new Square(Math.random()*900+10,Math.random()*700+10,  20));
		}
	}
	private void addTank(Tank t) {
        addGameObject(t);
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
