package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Panels.MainMenue;
import main.Var;

public class BTNListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(MainMenue.btnEditor)) {
			Var.mainMenuePanel.setVisible(false);
			Var.jf1.setContentPane(Var.editorPanel);
		} else {
			System.out.println(e.getClass());
		}

	}

}
