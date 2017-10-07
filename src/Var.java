import javax.swing.JFrame;
import javax.swing.JPanel;

public class Var {

	public static JFrame jf1;
	public static int contentPane;
	public static JPanel mainMenuePanel, editorPanel;

	public Var() {

		contentPane = 1;

		// Panels 
		mainMenuePanel = new MainMenue();
		editorPanel = new EditorPanel();

		jf1 = new Frame();
		if (contentPane == 0) {
			jf1.setContentPane(mainMenuePanel);
		} else if (contentPane == 1) {
			jf1.setContentPane(editorPanel);
		}
	}

}
