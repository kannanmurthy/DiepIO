
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;// this timer is best with Swing Components
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MovingObjectsPanel extends JPanel {

	final Dimension defaultDim;// = new Dimension(800,600);
	GameMap gm;
	// = new DiepIOMap();
	//GameBoard board= new GameBoard();    
	public MovingObjectsPanel() {
		this( new Dimension(800,600));
	}
//	public MovingObjectsPanel(Dimension dim) {
//		defaultDim = dim;
//		this.setPreferredSize(defaultDim);
//		makeGameMap();
//	}
//	private void makeGameMap() {
//		gm = new DiepIOMap();
//	}

////here is my code that creates the animation:  This code goes in the 
////Panel class

private Timer t;// belongs to the class


public MovingObjectsPanel(Dimension dim) {
	defaultDim = dim;
	this.setPreferredSize(defaultDim);
	makeGameMap();
	setUpKeyMappings();
	t.start();// start the timer which starts the "ticking"
}

private void makeGameMap() {
	gm = new DiepIOMap(this.defaultDim);// let the map know what dim is
	t = new Timer(10, new ActionListener() {// fires off every 10 ms
		@Override
		public void actionPerformed(ActionEvent arg0) {
			gm.tick();// I tell the GameMap to tick... do what
					// you do every time the clock goes off.
			repaint();// naturally, we want to see the new view
		}
			
	});// this semicolon is here because it is the end of the new Timer construction...
}
	
public void addFrame(Graphics g){
	g.setColor(Color.black);
	g.fillRect(20, 2, 2, 853);
	g.fillRect(15, 5, 1490, 2);
	g.fillRect(15, 850, 1490, 2);
	g.fillRect(1500, 2, 2, 853);
}
	
	private void setUpKeyMappings() {
		// maps keys with actions...
		//  The code below maps a KeyStroke to an action to be performed
		// In this case I mapped the space bar key to the action named "shoot"
		// Whenever someone hits the Space Bar the action shoot is sent out

		this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"shoot");

		//  This associates the command shoot with some action.  In this 
		// case, the action triggers a shoot command invoked on my GameMap.  In general, whatever 
		// goes in the actionPerformed method will be executed when a shoot command
		// is sent...

		this.getActionMap().put("shoot",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DiepIOMap.tankList.get(0).shoot();
				//panel just tells what the frick got pressed
				//panel tells tank that it needs to shoot
				//tank returns a list of bullets
				//add bullets to movingObject list
				//each tick, panel moves every object in movingObject

			}
		});
		
		this.getInputMap().put(KeyStroke.getKeyStroke("W"), "Up");
		
		this.getActionMap().put("Up",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				DiepIOMap.tankList.get(0).accelerate();
				// TODO Auto-generated method stub
				//panel just tells what the frick got pressed
				//panel tells tank that it needs to shoot
				//tank returns a list of bullets
				//add bullets to movingObject list
				//each tick, panel moves every object in movingObject

			}
		});
		
		this.getInputMap().put(KeyStroke.getKeyStroke("D"), "RotateRight");
		
		this.getActionMap().put("RotateRight",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DiepIOMap.tankList.get(0).rotateRight();
				//panel just tells what the frick got pressed
				//panel tells tank that it needs to shoot
				//tank returns a list of bullets
				//add bullets to movingObject list
				//each tick, panel moves every object in movingObject

			}
		});
		
		this.getInputMap().put(KeyStroke.getKeyStroke("A"), "RotateLeft");
		
		this.getActionMap().put("RotateLeft",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DiepIOMap.tankList.get(0).rotateLeft();
				//panel just tells what the frick got pressed
				//panel tells tank that it needs to shoot
				//tank returns a list of bullets
				//add bullets to movingObject list
				//each tick, panel moves every object in movingObject

			}
		});
		

		this.requestFocusInWindow();        
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		gm.draw(g);
		addFrame(g);
		
	}
}

