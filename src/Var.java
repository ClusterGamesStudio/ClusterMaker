import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Var {
<<<<<<< HEAD
	
	public static HashMap<String, String> languages;
=======

	public static String title = "ClusterMaker";
	public static int width = 800, height = 600;
>>>>>>> origin/master
	public static JFrame jf1;
	public static ContentPanel contentPane;
	public static JPanel mainMenuePanel, editorPanel;

	public Var() {

		contentPane = ContentPanel.MAINMENUE;

		// Panels 
		mainMenuePanel = new MainMenue();
		editorPanel = new EditorPanel();

		jf1 = new Frame();
		if (contentPane == ContentPanel.MAINMENUE) {
			jf1.setContentPane(mainMenuePanel);
		} else if (contentPane == ContentPanel.EDITOR) {
			jf1.setContentPane(editorPanel);
		}
	}

}
