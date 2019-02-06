package JButtonActionSample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClickAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		JOptionPane.showMessageDialog(null,"Test Message.");
	}

}
