package Listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javafx.scene.input.KeyCode;
import main.Var;

public class Keylistener implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == 'a'){
			Var.goLeft = true;
		}else if(e.getKeyChar() == 's'){
			Var.sneak = true;
		}else if(e.getKeyChar() == 'd'){
			Var.goRight = true;
		}else if(e.getKeyChar() == ' '){			
			Var.jump = true;
		}
		System.out.println("true");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar() == 'a'){
			Var.goLeft = false;
		}else if(e.getKeyChar() == 's'){
			Var.sneak = false;
		}else if(e.getKeyChar() == 'd'){
			Var.goRight = false;
		}else if(e.getKeyChar() == ' '){			
			Var.jump = false;
		}
		System.out.println("false");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
