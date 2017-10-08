package Panels;

import javax.swing.JPanel;

import Listeners.Keylistener;

public class GamePanel extends JPanel{

	public GamePanel() {
		addKeyListener(new Keylistener());
	}

}
