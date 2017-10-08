import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenue extends JPanel{
	private JButton btnEditor, btnExit;
	
	public MainMenue(){
		setLayout(null);
		btnEditor = new JButton("Editor");
		btnEditor.setBounds(Var.width/2-100, 100, 200, 50);
		btnEditor.setVisible(true);
		
		add(btnEditor);
		
	}
}
