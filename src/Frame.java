import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {
		setSize(Var.width, Var.height);
		setTitle(Var.title);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

}
