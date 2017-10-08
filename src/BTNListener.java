import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BTNListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(MainMenue.btnEditor)) {
			Var.jf1.setContentPane(Var.editorPanel);
		} else {
			System.out.println(e.getClass());
		}

	}

}
