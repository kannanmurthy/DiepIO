import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MovingObjectsPanel extends JPanel {

	final Dimension defaultDim;// = new Dimension(800,600);
	GameMap gm;// = new DiepIOMap();
	//GameBoard board= new GameBoard();    
	public MovingObjectsPanel() {
		this( new Dimension(800,600));
	}
	public MovingObjectsPanel(Dimension dim) {
		defaultDim = dim;
		this.setPreferredSize(defaultDim);
		makeGameMap();
	}
	private void makeGameMap() {
		gm = new DiepIOMap();
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

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		gm.draw(g);

	}
}
