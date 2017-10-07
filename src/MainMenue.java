import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenue extends JPanel{
	private JButton btnEditor, btnExit;
	
	public MainMenue(){
		btnEditor = new JButton("Editor");
		btnEditor.setBounds(Var.jf1.getWidth()/2-100, 200, 200, 50);
		
	}
}
