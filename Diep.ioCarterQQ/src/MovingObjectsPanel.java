import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.*;
//changes

public class MovingObjectsPanel extends JPanel {

	Dimension defaultDim = new Dimension();// = new Dimension(800,600);
	GameMap gm;// = new DiepIOMap();
	//GameBoard board= new GameBoard();
	public MovingObjectsPanel() {
		new Dimension(800,600);
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
				// gm.shoot();
				//panel just tells what the frick got pressed
				//panel tells tank that it needs to shoot
				//tank returns a list of bullets
				//add bullets to movingObject list
				//each tick, panel moves every object in movingObject

			}
		});
		this.requestFocusInWindow();        
	}
	
	// this timer is best with Swing Components

private Timer t;// belongs to the class


public MovingObjectsPanel(Dimension dim) {
	defaultDim = dim;
	this.setPreferredSize(defaultDim);
	makeGameMap();
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
	

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		gm.draw(g);

	}
}
