package JButtonSample;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JFrame extends javax.swing.JFrame {

	public JFrame() throws HeadlessException {
		// TODO 自動生成されたコンストラクター・スタブ
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(512, 460);
		setTitle("This is title.");

		JButton btn1 = new JButton("Button1");
		add(btn1);

		ImageIcon icon = new ImageIcon(
				getClass().getResource("Resource/icon.png")
		);
		JButton btn2 = new JButton("Button2", icon);
		
		add(btn2);

		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO 自動生成されたメソッド・スタブ
				JFrame frame = new JFrame();
			}

		});

	}

}
