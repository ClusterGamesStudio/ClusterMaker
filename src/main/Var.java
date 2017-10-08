package main;

import editor.EditorPanel;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Panels.ContentPanel;
import Panels.GamePanel;
import Panels.MainMenue;

public class Var {
	
	public static boolean goLeft, goRight, sneak, jump;
	
	public static HashMap<String, String> languages;

	public static String title = "ClusterMaker";
	public static int width = 1200, height = 675;
	
	public static JFrame jf1;
	public static ContentPanel contentPane;
	public static JPanel mainMenuePanel, editorPanel, gamePanel;

	public Var() {

		contentPane = ContentPanel.MAINMENUE;

		// Panels 
		mainMenuePanel = new MainMenue();
		editorPanel = new EditorPanel();
		gamePanel = new GamePanel();
		
		jf1 = new Frame();
		
		if (contentPane == ContentPanel.MAINMENUE) {
			jf1.setContentPane(mainMenuePanel);
		} else if (contentPane == ContentPanel.EDITOR) {
			jf1.setContentPane(editorPanel);
		}
	}

}
