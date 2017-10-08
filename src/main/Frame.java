package main;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import Listeners.Keylistener;

public class Frame extends JFrame{

	public Frame() {
		setSize(Var.width, Var.height);
		setTitle(Var.title);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

}
